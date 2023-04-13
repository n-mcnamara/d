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

import com.liferay.docs.recordedlectures.exception.NoSuchlectureUploadException;
import com.liferay.docs.recordedlectures.model.lectureUpload;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the lecture upload service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see lectureUploadUtil
 * @generated
 */
@ProviderType
public interface lectureUploadPersistence
	extends BasePersistence<lectureUpload> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lectureUploadUtil} to access the lecture upload persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lecture uploads
	 */
	public java.util.List<lectureUpload> findByUuid(String uuid);

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
	public java.util.List<lectureUpload> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public java.util.List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

	/**
	 * Returns the lecture uploads before and after the current lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uploadId the primary key of the current lecture upload
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public lectureUpload[] findByUuid_PrevAndNext(
			long uploadId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Removes all the lecture uploads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lecture uploads
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByUUID_G(String uuid, long groupId)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the lecture upload where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lecture upload that was removed
	 */
	public lectureUpload removeByUUID_G(String uuid, long groupId)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lecture uploads
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lecture uploads
	 */
	public java.util.List<lectureUpload> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public java.util.List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public lectureUpload[] findByUuid_C_PrevAndNext(
			long uploadId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Removes all the lecture uploads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lecture uploads
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the matching lecture uploads
	 */
	public java.util.List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId);

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
	public java.util.List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end);

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
	public java.util.List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public java.util.List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByG_G_First(
			long groupId, long recordedlectureId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the first lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByG_G_First(
		long groupId, long recordedlectureId,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

	/**
	 * Returns the last lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	public lectureUpload findByG_G_Last(
			long groupId, long recordedlectureId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the last lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	public lectureUpload fetchByG_G_Last(
		long groupId, long recordedlectureId,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public lectureUpload[] findByG_G_PrevAndNext(
			long uploadId, long groupId, long recordedlectureId,
			com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
				orderByComparator)
		throws NoSuchlectureUploadException;

	/**
	 * Removes all the lecture uploads where groupId = &#63; and recordedlectureId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 */
	public void removeByG_G(long groupId, long recordedlectureId);

	/**
	 * Returns the number of lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the number of matching lecture uploads
	 */
	public int countByG_G(long groupId, long recordedlectureId);

	/**
	 * Caches the lecture upload in the entity cache if it is enabled.
	 *
	 * @param lectureUpload the lecture upload
	 */
	public void cacheResult(lectureUpload lectureUpload);

	/**
	 * Caches the lecture uploads in the entity cache if it is enabled.
	 *
	 * @param lectureUploads the lecture uploads
	 */
	public void cacheResult(java.util.List<lectureUpload> lectureUploads);

	/**
	 * Creates a new lecture upload with the primary key. Does not add the lecture upload to the database.
	 *
	 * @param uploadId the primary key for the new lecture upload
	 * @return the new lecture upload
	 */
	public lectureUpload create(long uploadId);

	/**
	 * Removes the lecture upload with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload that was removed
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public lectureUpload remove(long uploadId)
		throws NoSuchlectureUploadException;

	public lectureUpload updateImpl(lectureUpload lectureUpload);

	/**
	 * Returns the lecture upload with the primary key or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	public lectureUpload findByPrimaryKey(long uploadId)
		throws NoSuchlectureUploadException;

	/**
	 * Returns the lecture upload with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload, or <code>null</code> if a lecture upload with the primary key could not be found
	 */
	public lectureUpload fetchByPrimaryKey(long uploadId);

	/**
	 * Returns all the lecture uploads.
	 *
	 * @return the lecture uploads
	 */
	public java.util.List<lectureUpload> findAll();

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
	public java.util.List<lectureUpload> findAll(int start, int end);

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
	public java.util.List<lectureUpload> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator);

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
	public java.util.List<lectureUpload> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lectureUpload>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the lecture uploads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lecture uploads.
	 *
	 * @return the number of lecture uploads
	 */
	public int countAll();

}