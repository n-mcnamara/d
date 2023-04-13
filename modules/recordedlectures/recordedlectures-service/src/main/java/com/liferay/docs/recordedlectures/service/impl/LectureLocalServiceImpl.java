/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.recordedlectures.service.impl;

import com.liferay.docs.recordedlectures.exception.GuestbookNameException;
import com.liferay.docs.recordedlectures.exception.NoSuchLectureException;
import com.liferay.docs.recordedlectures.model.Lecture;
import com.liferay.docs.recordedlectures.service.base.LectureLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the lecture local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.docs.recordedlectures.service.LectureLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see LectureLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.docs.recordedlectures.model.Lecture",
	service = AopService.class
)
public class LectureLocalServiceImpl extends LectureLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.docs.recordedlectures.service.LectureLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.docs.recordedlectures.service.LectureLocalServiceUtil</code>.
	 */

	public Lecture addLecture(long userId, String title, String URL,
							  ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(title);

		long lectureId = counterLocalService.increment();

		Lecture lecture = lecturePersistence.create(lectureId);
		lecture.setUuid(serviceContext.getUuid());
		lecture.setUserId(userId);
		lecture.setGroupId(groupId);
		lecture.setCompanyId(user.getCompanyId());
		lecture.setUserName(user.getFullName());
		lecture.setCreateDate(serviceContext.getCreateDate(now));
		lecture.setModifiedDate(serviceContext.getModifiedDate(now));
		lecture.setTitle(title);
		lecture.setExpandoBridgeAttributes(serviceContext);
		lecture.setVideoURL(URL);

		lecturePersistence.update(lecture);

		return lecture;
	}

	public Lecture deleteLecture(Lecture entry)
			throws PortalException {

		lecturePersistence.remove(entry);

		return entry;
	}

	public Lecture deleteLecture(long entryId) throws PortalException {

		Lecture entry =
				lecturePersistence.findByPrimaryKey(entryId);

		return deleteLecture(entry);
	}

	public String getLectueUrl(long lectureId) throws NoSuchLectureException {
		Lecture entry = lecturePersistence.findByPrimaryKey(lectureId);
		return entry.getVideoURL();
	}


	public List<Lecture> getLectures(long groupId) {

		return lecturePersistence.findByGroupId(groupId);
	}

	@Override
	public List<Lecture> getLectures(long groupId, int start, int end, OrderByComparator<Lecture> obc) {
		return lecturePersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Lecture> getLectures(long groupId, int start, int end) {
		return lecturePersistence.findByGroupId(groupId, start, end);
	}

	public List<Lecture> getGuestbooks(long groupId, int start, int end) {

		return lecturePersistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

		return lecturePersistence.countByGroupId(groupId);
	}



	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new GuestbookNameException();
		}
	}
}