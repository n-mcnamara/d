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

package com.liferay.docs.recordedlectures.service.persistence;

import com.liferay.docs.recordedlectures.model.lectureUpload;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the lecture upload service. This utility wraps <code>com.liferay.docs.recordedlectures.service.persistence.impl.lectureUploadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see lectureUploadPersistence
 * @generated
 */
public class lectureUploadUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(lectureUpload lectureUpload) {
		getPersistence().clearCache(lectureUpload);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, lectureUpload> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<lectureUpload> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<lectureUpload> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<lectureUpload> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static lectureUpload update(lectureUpload lectureUpload) {
		return getPersistence().update(lectureUpload);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static lectureUpload update(
		lectureUpload lectureUpload, ServiceContext serviceContext) {

		return getPersistence().update(lectureUpload, serviceContext);
	}

	/**
	 * Returns all the lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the lecture uploads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @return the range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByUuid_First(
			String uuid, OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUuid_First(
		String uuid, OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByUuid_Last(
			String uuid, OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUuid_Last(
		String uuid, OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the lecture uploads before and after the current lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uploadId the primary key of the current lecture upload
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload[] findByUuid_PrevAndNext(
			long uploadId, String uuid,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_PrevAndNext(
			uploadId, uuid, orderByComparator);
	}

	/**
	 * Removes all the lecture uploads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lecture uploads
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the lecture upload where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lecture upload that was removed
	 */
	public static lectureUpload removeByUUID_G(String uuid, long groupId)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lecture uploads
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @return the range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the lecture uploads before and after the current lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uploadId the primary key of the current lecture upload
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload[] findByUuid_C_PrevAndNext(
			long uploadId, String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByUuid_C_PrevAndNext(
			uploadId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the lecture uploads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lecture uploads
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the matching lecture uploads
	 */
	public static List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId) {

		return getPersistence().findByG_G(groupId, recordedlectureId);
	}

	/**
	 * Returns a range of all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @return the range of matching lecture uploads
	 */
	public static List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end) {

		return getPersistence().findByG_G(
			groupId, recordedlectureId, start, end);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().findByG_G(
			groupId, recordedlectureId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lecture uploads
	 */
	public static List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_G(
			groupId, recordedlectureId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByG_G_First(
			long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByG_G_First(
			groupId, recordedlectureId, orderByComparator);
	}

	/**
	 * Returns the first lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByG_G_First(
		long groupId, long recordedlectureId,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByG_G_First(
			groupId, recordedlectureId, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public static lectureUpload findByG_G_Last(
			long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByG_G_Last(
			groupId, recordedlectureId, orderByComparator);
	}

	/**
	 * Returns the last lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public static lectureUpload fetchByG_G_Last(
		long groupId, long recordedlectureId,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().fetchByG_G_Last(
			groupId, recordedlectureId, orderByComparator);
	}

	/**
	 * Returns the lecture uploads before and after the current lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param uploadId the primary key of the current lecture upload
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload[] findByG_G_PrevAndNext(
			long uploadId, long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByG_G_PrevAndNext(
			uploadId, groupId, recordedlectureId, orderByComparator);
	}

	/**
	 * Removes all the lecture uploads where groupId = &#63; and recordedlectureId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 */
	public static void removeByG_G(long groupId, long recordedlectureId) {
		getPersistence().removeByG_G(groupId, recordedlectureId);
	}

	/**
	 * Returns the number of lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the number of matching lecture uploads
	 */
	public static int countByG_G(long groupId, long recordedlectureId) {
		return getPersistence().countByG_G(groupId, recordedlectureId);
	}

	/**
	 * Caches the lecture upload in the entity cache if it is enabled.
	 *
	 * @param lectureUpload the lecture upload
	 */
	public static void cacheResult(lectureUpload lectureUpload) {
		getPersistence().cacheResult(lectureUpload);
	}

	/**
	 * Caches the lecture uploads in the entity cache if it is enabled.
	 *
	 * @param lectureUploads the lecture uploads
	 */
	public static void cacheResult(List<lectureUpload> lectureUploads) {
		getPersistence().cacheResult(lectureUploads);
	}

	/**
	 * Creates a new lecture upload with the primary key. Does not add the lecture upload to the database.
	 *
	 * @param uploadId the primary key for the new lecture upload
	 * @return the new lecture upload
	 */
	public static lectureUpload create(long uploadId) {
		return getPersistence().create(uploadId);
	}

	/**
	 * Removes the lecture upload with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload that was removed
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload remove(long uploadId)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().remove(uploadId);
	}

	public static lectureUpload updateImpl(lectureUpload lectureUpload) {
		return getPersistence().updateImpl(lectureUpload);
	}

	/**
	 * Returns the lecture upload with the primary key or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload findByPrimaryKey(long uploadId)
		throws com.liferay.docs.recordedlectures.exception.
			NoSuchlectureUploadException {

		return getPersistence().findByPrimaryKey(uploadId);
	}

	/**
	 * Returns the lecture upload with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload, or <code>null</code> if a lecture upload with the primary key could not be found
	 */
	public static lectureUpload fetchByPrimaryKey(long uploadId) {
		return getPersistence().fetchByPrimaryKey(uploadId);
	}

	/**
	 * Returns all the lecture uploads.
	 *
	 * @return the lecture uploads
	 */
	public static List<lectureUpload> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the lecture uploads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @return the range of lecture uploads
	 */
	public static List<lectureUpload> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the lecture uploads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lecture uploads
	 */
	public static List<lectureUpload> findAll(
		int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the lecture uploads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>lectureUploadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lecture uploads
	 * @param end the upper bound of the range of lecture uploads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of lecture uploads
	 */
	public static List<lectureUpload> findAll(
		int start, int end, OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the lecture uploads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of lecture uploads.
	 *
	 * @return the number of lecture uploads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static lectureUploadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile lectureUploadPersistence _persistence;

}