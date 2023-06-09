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

package com.liferay.docs.recordedlectures.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LectureLocalService}.
 *
 * @author liferay
 * @see LectureLocalService
 * @generated
 */
public class LectureLocalServiceWrapper
	implements LectureLocalService, ServiceWrapper<LectureLocalService> {

	public LectureLocalServiceWrapper() {
		this(null);
	}

	public LectureLocalServiceWrapper(LectureLocalService lectureLocalService) {
		_lectureLocalService = lectureLocalService;
	}

	/**
	 * Adds the lecture to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LectureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lecture the lecture
	 * @return the lecture that was added
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture addLecture(
		com.liferay.docs.recordedlectures.model.Lecture lecture) {

		return _lectureLocalService.addLecture(lecture);
	}

	@Override
	public com.liferay.docs.recordedlectures.model.Lecture addLecture(
			long userId, String title, String URL,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.addLecture(
			userId, title, URL, serviceContext);
	}

	/**
	 * Creates a new lecture with the primary key. Does not add the lecture to the database.
	 *
	 * @param recordedlectureId the primary key for the new lecture
	 * @return the new lecture
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture createLecture(
		long recordedlectureId) {

		return _lectureLocalService.createLecture(recordedlectureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the lecture from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LectureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lecture the lecture
	 * @return the lecture that was removed
	 * @throws PortalException
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture deleteLecture(
			com.liferay.docs.recordedlectures.model.Lecture lecture)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.deleteLecture(lecture);
	}

	/**
	 * Deletes the lecture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LectureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param recordedlectureId the primary key of the lecture
	 * @return the lecture that was removed
	 * @throws PortalException if a lecture with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture deleteLecture(
			long recordedlectureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.deleteLecture(recordedlectureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _lectureLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _lectureLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lectureLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _lectureLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.LectureModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _lectureLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.LectureModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _lectureLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _lectureLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _lectureLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.recordedlectures.model.Lecture fetchLecture(
		long recordedlectureId) {

		return _lectureLocalService.fetchLecture(recordedlectureId);
	}

	/**
	 * Returns the lecture matching the UUID and group.
	 *
	 * @param uuid the lecture's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture
		fetchLectureByUuidAndGroupId(String uuid, long groupId) {

		return _lectureLocalService.fetchLectureByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _lectureLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _lectureLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getGuestbooks(long groupId, int start, int end) {

		return _lectureLocalService.getGuestbooks(groupId, start, end);
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _lectureLocalService.getGuestbooksCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _lectureLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public String getLectueUrl(long lectureId)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchLectureException {

		return _lectureLocalService.getLectueUrl(lectureId);
	}

	/**
	 * Returns the lecture with the primary key.
	 *
	 * @param recordedlectureId the primary key of the lecture
	 * @return the lecture
	 * @throws PortalException if a lecture with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture getLecture(
			long recordedlectureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.getLecture(recordedlectureId);
	}

	/**
	 * Returns the lecture matching the UUID and group.
	 *
	 * @param uuid the lecture's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lecture
	 * @throws PortalException if a matching lecture could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture
			getLectureByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.getLectureByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the lectures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.LectureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @return the range of lectures
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLectures(int start, int end) {

		return _lectureLocalService.getLectures(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLectures(long groupId) {

		return _lectureLocalService.getLectures(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLectures(long groupId, int start, int end) {

		return _lectureLocalService.getLectures(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLectures(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.recordedlectures.model.Lecture> obc) {

		return _lectureLocalService.getLectures(groupId, start, end, obc);
	}

	/**
	 * Returns all the lectures matching the UUID and company.
	 *
	 * @param uuid the UUID of the lectures
	 * @param companyId the primary key of the company
	 * @return the matching lectures, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLecturesByUuidAndCompanyId(String uuid, long companyId) {

		return _lectureLocalService.getLecturesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of lectures matching the UUID and company.
	 *
	 * @param uuid the UUID of the lectures
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching lectures, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.Lecture>
		getLecturesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.recordedlectures.model.Lecture>
					orderByComparator) {

		return _lectureLocalService.getLecturesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of lectures.
	 *
	 * @return the number of lectures
	 */
	@Override
	public int getLecturesCount() {
		return _lectureLocalService.getLecturesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _lectureLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lecture in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LectureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lecture the lecture
	 * @return the lecture that was updated
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.Lecture updateLecture(
		com.liferay.docs.recordedlectures.model.Lecture lecture) {

		return _lectureLocalService.updateLecture(lecture);
	}

	@Override
	public LectureLocalService getWrappedService() {
		return _lectureLocalService;
	}

	@Override
	public void setWrappedService(LectureLocalService lectureLocalService) {
		_lectureLocalService = lectureLocalService;
	}

	private LectureLocalService _lectureLocalService;

}