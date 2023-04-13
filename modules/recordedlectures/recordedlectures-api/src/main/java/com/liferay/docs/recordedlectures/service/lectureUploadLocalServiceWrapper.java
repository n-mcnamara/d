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
 * Provides a wrapper for {@link lectureUploadLocalService}.
 *
 * @author liferay
 * @see lectureUploadLocalService
 * @generated
 */
public class lectureUploadLocalServiceWrapper
	implements lectureUploadLocalService,
			   ServiceWrapper<lectureUploadLocalService> {

	public lectureUploadLocalServiceWrapper() {
		this(null);
	}

	public lectureUploadLocalServiceWrapper(
		lectureUploadLocalService lectureUploadLocalService) {

		_lectureUploadLocalService = lectureUploadLocalService;
	}

	/**
	 * Adds the lecture upload to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect lectureUploadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lectureUpload the lecture upload
	 * @return the lecture upload that was added
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		addlectureUpload(
			com.liferay.docs.recordedlectures.model.lectureUpload
				lectureUpload) {

		return _lectureUploadLocalService.addlectureUpload(lectureUpload);
	}

	/**
	 * Creates a new lecture upload with the primary key. Does not add the lecture upload to the database.
	 *
	 * @param uploadId the primary key for the new lecture upload
	 * @return the new lecture upload
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		createlectureUpload(long uploadId) {

		return _lectureUploadLocalService.createlectureUpload(uploadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the lecture upload from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect lectureUploadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lectureUpload the lecture upload
	 * @return the lecture upload that was removed
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		deletelectureUpload(
			com.liferay.docs.recordedlectures.model.lectureUpload
				lectureUpload) {

		return _lectureUploadLocalService.deletelectureUpload(lectureUpload);
	}

	/**
	 * Deletes the lecture upload with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect lectureUploadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload that was removed
	 * @throws PortalException if a lecture upload with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
			deletelectureUpload(long uploadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.deletelectureUpload(uploadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _lectureUploadLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _lectureUploadLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lectureUploadLocalService.dynamicQuery();
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

		return _lectureUploadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.lectureUploadModelImpl</code>.
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

		return _lectureUploadLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.lectureUploadModelImpl</code>.
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

		return _lectureUploadLocalService.dynamicQuery(
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

		return _lectureUploadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _lectureUploadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		fetchlectureUpload(long uploadId) {

		return _lectureUploadLocalService.fetchlectureUpload(uploadId);
	}

	/**
	 * Returns the lecture upload matching the UUID and group.
	 *
	 * @param uuid the lecture upload's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		fetchlectureUploadByUuidAndGroupId(String uuid, long groupId) {

		return _lectureUploadLocalService.fetchlectureUploadByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _lectureUploadLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _lectureUploadLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _lectureUploadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the lecture upload with the primary key.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws PortalException if a lecture upload with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
			getlectureUpload(long uploadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.getlectureUpload(uploadId);
	}

	/**
	 * Returns the lecture upload matching the UUID and group.
	 *
	 * @param uuid the lecture upload's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lecture upload
	 * @throws PortalException if a matching lecture upload could not be found
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
			getlectureUploadByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.getlectureUploadByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the lecture uploads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.docs.recordedlectures.model.impl.lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @return the range of lecture uploads
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.lectureUpload>
		getlectureUploads(int start, int end) {

		return _lectureUploadLocalService.getlectureUploads(start, end);
	}

	/**
	 * Returns all the lecture uploads matching the UUID and company.
	 *
	 * @param uuid the UUID of the lecture uploads
	 * @param companyId the primary key of the company
	 * @return the matching lecture uploads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.lectureUpload>
		getlectureUploadsByUuidAndCompanyId(String uuid, long companyId) {

		return _lectureUploadLocalService.getlectureUploadsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of lecture uploads matching the UUID and company.
	 *
	 * @param uuid the UUID of the lecture uploads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching lecture uploads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.recordedlectures.model.lectureUpload>
		getlectureUploadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.recordedlectures.model.lectureUpload>
					orderByComparator) {

		return _lectureUploadLocalService.getlectureUploadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of lecture uploads.
	 *
	 * @return the number of lecture uploads
	 */
	@Override
	public int getlectureUploadsCount() {
		return _lectureUploadLocalService.getlectureUploadsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _lectureUploadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _lectureUploadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the lecture upload in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect lectureUploadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param lectureUpload the lecture upload
	 * @return the lecture upload that was updated
	 */
	@Override
	public com.liferay.docs.recordedlectures.model.lectureUpload
		updatelectureUpload(
			com.liferay.docs.recordedlectures.model.lectureUpload
				lectureUpload) {

		return _lectureUploadLocalService.updatelectureUpload(lectureUpload);
	}

	@Override
	public lectureUploadLocalService getWrappedService() {
		return _lectureUploadLocalService;
	}

	@Override
	public void setWrappedService(
		lectureUploadLocalService lectureUploadLocalService) {

		_lectureUploadLocalService = lectureUploadLocalService;
	}

	private lectureUploadLocalService _lectureUploadLocalService;

}