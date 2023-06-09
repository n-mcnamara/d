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

import com.liferay.docs.recordedlectures.exception.NoSuchLectureException;
import com.liferay.docs.recordedlectures.model.Lecture;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the lecture service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see LectureUtil
 * @generated
 */
@ProviderType
public interface LecturePersistence extends BasePersistence<Lecture> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LectureUtil} to access the lecture persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the lectures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lectures
	 */
	public java.util.List<Lecture> findByUuid(String uuid);

	/**
	 * Returns a range of all the lectures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @return the range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the lectures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lectures where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the first lecture in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the last lecture in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the last lecture in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the lectures before and after the current lecture in the ordered set where uuid = &#63;.
	 *
	 * @param recordedlectureId the primary key of the current lecture
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture
	 * @throws NoSuchLectureException if a lecture with the primary key could not be found
	 */
	public Lecture[] findByUuid_PrevAndNext(
			long recordedlectureId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Removes all the lectures where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of lectures where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lectures
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the lecture where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLectureException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByUUID_G(String uuid, long groupId)
		throws NoSuchLectureException;

	/**
	 * Returns the lecture where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the lecture where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the lecture where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lecture that was removed
	 */
	public Lecture removeByUUID_G(String uuid, long groupId)
		throws NoSuchLectureException;

	/**
	 * Returns the number of lectures where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lectures
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the lectures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lectures
	 */
	public java.util.List<Lecture> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the lectures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @return the range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the lectures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lectures where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the first lecture in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the last lecture in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the last lecture in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the lectures before and after the current lecture in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param recordedlectureId the primary key of the current lecture
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture
	 * @throws NoSuchLectureException if a lecture with the primary key could not be found
	 */
	public Lecture[] findByUuid_C_PrevAndNext(
			long recordedlectureId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Removes all the lectures where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of lectures where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lectures
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the lectures where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lectures
	 */
	public java.util.List<Lecture> findByGroupId(long groupId);

	/**
	 * Returns a range of all the lectures where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @return the range of matching lectures
	 */
	public java.util.List<Lecture> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the lectures where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lectures where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching lectures
	 */
	public java.util.List<Lecture> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first lecture in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the first lecture in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the last lecture in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture
	 * @throws NoSuchLectureException if a matching lecture could not be found
	 */
	public Lecture findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Returns the last lecture in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture, or <code>null</code> if a matching lecture could not be found
	 */
	public Lecture fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns the lectures before and after the current lecture in the ordered set where groupId = &#63;.
	 *
	 * @param recordedlectureId the primary key of the current lecture
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lecture
	 * @throws NoSuchLectureException if a lecture with the primary key could not be found
	 */
	public Lecture[] findByGroupId_PrevAndNext(
			long recordedlectureId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Lecture>
				orderByComparator)
		throws NoSuchLectureException;

	/**
	 * Removes all the lectures where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of lectures where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lectures
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the lecture in the entity cache if it is enabled.
	 *
	 * @param lecture the lecture
	 */
	public void cacheResult(Lecture lecture);

	/**
	 * Caches the lectures in the entity cache if it is enabled.
	 *
	 * @param lectures the lectures
	 */
	public void cacheResult(java.util.List<Lecture> lectures);

	/**
	 * Creates a new lecture with the primary key. Does not add the lecture to the database.
	 *
	 * @param recordedlectureId the primary key for the new lecture
	 * @return the new lecture
	 */
	public Lecture create(long recordedlectureId);

	/**
	 * Removes the lecture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recordedlectureId the primary key of the lecture
	 * @return the lecture that was removed
	 * @throws NoSuchLectureException if a lecture with the primary key could not be found
	 */
	public Lecture remove(long recordedlectureId) throws NoSuchLectureException;

	public Lecture updateImpl(Lecture lecture);

	/**
	 * Returns the lecture with the primary key or throws a <code>NoSuchLectureException</code> if it could not be found.
	 *
	 * @param recordedlectureId the primary key of the lecture
	 * @return the lecture
	 * @throws NoSuchLectureException if a lecture with the primary key could not be found
	 */
	public Lecture findByPrimaryKey(long recordedlectureId)
		throws NoSuchLectureException;

	/**
	 * Returns the lecture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recordedlectureId the primary key of the lecture
	 * @return the lecture, or <code>null</code> if a lecture with the primary key could not be found
	 */
	public Lecture fetchByPrimaryKey(long recordedlectureId);

	/**
	 * Returns all the lectures.
	 *
	 * @return the lectures
	 */
	public java.util.List<Lecture> findAll();

	/**
	 * Returns a range of all the lectures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @return the range of lectures
	 */
	public java.util.List<Lecture> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the lectures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lectures
	 */
	public java.util.List<Lecture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the lectures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LectureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of lectures
	 * @param end the upper bound of the range of lectures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of lectures
	 */
	public java.util.List<Lecture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lecture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the lectures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of lectures.
	 *
	 * @return the number of lectures
	 */
	public int countAll();

}