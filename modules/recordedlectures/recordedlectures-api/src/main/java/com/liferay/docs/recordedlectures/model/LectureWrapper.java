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

package com.liferay.docs.recordedlectures.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Lecture}.
 * </p>
 *
 * @author liferay
 * @see Lecture
 * @generated
 */
public class LectureWrapper
	extends BaseModelWrapper<Lecture>
	implements Lecture, ModelWrapper<Lecture> {

	public LectureWrapper(Lecture lecture) {
		super(lecture);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("recordedlectureId", getRecordedlectureId());
		attributes.put("Title", getTitle());
		attributes.put("videoURL", getVideoURL());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long recordedlectureId = (Long)attributes.get("recordedlectureId");

		if (recordedlectureId != null) {
			setRecordedlectureId(recordedlectureId);
		}

		String Title = (String)attributes.get("Title");

		if (Title != null) {
			setTitle(Title);
		}

		String videoURL = (String)attributes.get("videoURL");

		if (videoURL != null) {
			setVideoURL(videoURL);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Lecture cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this lecture.
	 *
	 * @return the company ID of this lecture
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this lecture.
	 *
	 * @return the create date of this lecture
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this lecture.
	 *
	 * @return the group ID of this lecture
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this lecture.
	 *
	 * @return the modified date of this lecture
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this lecture.
	 *
	 * @return the mvcc version of this lecture
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the primary key of this lecture.
	 *
	 * @return the primary key of this lecture
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the recordedlecture ID of this lecture.
	 *
	 * @return the recordedlecture ID of this lecture
	 */
	@Override
	public long getRecordedlectureId() {
		return model.getRecordedlectureId();
	}

	/**
	 * Returns the status of this lecture.
	 *
	 * @return the status of this lecture
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this lecture.
	 *
	 * @return the status by user ID of this lecture
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this lecture.
	 *
	 * @return the status by user name of this lecture
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this lecture.
	 *
	 * @return the status by user uuid of this lecture
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this lecture.
	 *
	 * @return the status date of this lecture
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the title of this lecture.
	 *
	 * @return the title of this lecture
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this lecture.
	 *
	 * @return the user ID of this lecture
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this lecture.
	 *
	 * @return the user name of this lecture
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this lecture.
	 *
	 * @return the user uuid of this lecture
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this lecture.
	 *
	 * @return the uuid of this lecture
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the video url of this lecture.
	 *
	 * @return the video url of this lecture
	 */
	@Override
	public String getVideoURL() {
		return model.getVideoURL();
	}

	/**
	 * Returns <code>true</code> if this lecture is approved.
	 *
	 * @return <code>true</code> if this lecture is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this lecture is denied.
	 *
	 * @return <code>true</code> if this lecture is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this lecture is a draft.
	 *
	 * @return <code>true</code> if this lecture is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this lecture is expired.
	 *
	 * @return <code>true</code> if this lecture is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this lecture is inactive.
	 *
	 * @return <code>true</code> if this lecture is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this lecture is incomplete.
	 *
	 * @return <code>true</code> if this lecture is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this lecture is pending.
	 *
	 * @return <code>true</code> if this lecture is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this lecture is scheduled.
	 *
	 * @return <code>true</code> if this lecture is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this lecture.
	 *
	 * @param companyId the company ID of this lecture
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this lecture.
	 *
	 * @param createDate the create date of this lecture
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this lecture.
	 *
	 * @param groupId the group ID of this lecture
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this lecture.
	 *
	 * @param modifiedDate the modified date of this lecture
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this lecture.
	 *
	 * @param mvccVersion the mvcc version of this lecture
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the primary key of this lecture.
	 *
	 * @param primaryKey the primary key of this lecture
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the recordedlecture ID of this lecture.
	 *
	 * @param recordedlectureId the recordedlecture ID of this lecture
	 */
	@Override
	public void setRecordedlectureId(long recordedlectureId) {
		model.setRecordedlectureId(recordedlectureId);
	}

	/**
	 * Sets the status of this lecture.
	 *
	 * @param status the status of this lecture
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this lecture.
	 *
	 * @param statusByUserId the status by user ID of this lecture
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this lecture.
	 *
	 * @param statusByUserName the status by user name of this lecture
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this lecture.
	 *
	 * @param statusByUserUuid the status by user uuid of this lecture
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this lecture.
	 *
	 * @param statusDate the status date of this lecture
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this lecture.
	 *
	 * @param Title the title of this lecture
	 */
	@Override
	public void setTitle(String Title) {
		model.setTitle(Title);
	}

	/**
	 * Sets the user ID of this lecture.
	 *
	 * @param userId the user ID of this lecture
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this lecture.
	 *
	 * @param userName the user name of this lecture
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this lecture.
	 *
	 * @param userUuid the user uuid of this lecture
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this lecture.
	 *
	 * @param uuid the uuid of this lecture
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the video url of this lecture.
	 *
	 * @param videoURL the video url of this lecture
	 */
	@Override
	public void setVideoURL(String videoURL) {
		model.setVideoURL(videoURL);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected LectureWrapper wrap(Lecture lecture) {
		return new LectureWrapper(lecture);
	}

}