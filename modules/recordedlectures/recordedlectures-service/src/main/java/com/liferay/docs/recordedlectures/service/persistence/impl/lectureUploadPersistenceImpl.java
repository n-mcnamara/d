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

package com.liferay.docs.recordedlectures.service.persistence.impl;

import com.liferay.docs.recordedlectures.exception.NoSuchlectureUploadException;
import com.liferay.docs.recordedlectures.model.impl.lectureUploadImpl;
import com.liferay.docs.recordedlectures.model.impl.lectureUploadModelImpl;
import com.liferay.docs.recordedlectures.model.lectureUpload;
import com.liferay.docs.recordedlectures.model.lectureUploadTable;
import com.liferay.docs.recordedlectures.service.persistence.impl.constants.RLPersistenceConstants;
import com.liferay.docs.recordedlectures.service.persistence.lectureUploadPersistence;
import com.liferay.docs.recordedlectures.service.persistence.lectureUploadUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the lecture upload service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @generated
 */
@Component(service = lectureUploadPersistence.class)
public class lectureUploadPersistenceImpl
	extends BasePersistenceImpl<lectureUpload>
	implements lectureUploadPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>lectureUploadUtil</code> to access the lecture upload persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		lectureUploadImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching lecture uploads
	 */
	@Override
	public List<lectureUpload> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<lectureUpload> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<lectureUpload> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<lectureUpload> list = null;

		if (useFinderCache) {
			list = (List<lectureUpload>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (lectureUpload lectureUpload : list) {
					if (!uuid.equals(lectureUpload.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<lectureUpload>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload findByUuid_First(
			String uuid, OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByUuid_First(
			uuid, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUuid_First(
		String uuid, OrderByComparator<lectureUpload> orderByComparator) {

		List<lectureUpload> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload findByUuid_Last(
			String uuid, OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByUuid_Last(uuid, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUuid_Last(
		String uuid, OrderByComparator<lectureUpload> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<lectureUpload> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public lectureUpload[] findByUuid_PrevAndNext(
			long uploadId, String uuid,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		uuid = Objects.toString(uuid, "");

		lectureUpload lectureUpload = findByPrimaryKey(uploadId);

		Session session = null;

		try {
			session = openSession();

			lectureUpload[] array = new lectureUploadImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, lectureUpload, uuid, orderByComparator, true);

			array[1] = lectureUpload;

			array[2] = getByUuid_PrevAndNext(
				session, lectureUpload, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected lectureUpload getByUuid_PrevAndNext(
		Session session, lectureUpload lectureUpload, String uuid,
		OrderByComparator<lectureUpload> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						lectureUpload)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<lectureUpload> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lecture uploads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (lectureUpload lectureUpload :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(lectureUpload);
		}
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching lecture uploads
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"lectureUpload.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(lectureUpload.uuid IS NULL OR lectureUpload.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload
	 * @throws NoSuchlectureUploadException if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload findByUUID_G(String uuid, long groupId)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByUUID_G(uuid, groupId);

		if (lectureUpload == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchlectureUploadException(sb.toString());
		}

		return lectureUpload;
	}

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the lecture upload where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof lectureUpload) {
			lectureUpload lectureUpload = (lectureUpload)result;

			if (!Objects.equals(uuid, lectureUpload.getUuid()) ||
				(groupId != lectureUpload.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<lectureUpload> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					lectureUpload lectureUpload = list.get(0);

					result = lectureUpload;

					cacheResult(lectureUpload);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (lectureUpload)result;
		}
	}

	/**
	 * Removes the lecture upload where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the lecture upload that was removed
	 */
	@Override
	public lectureUpload removeByUUID_G(String uuid, long groupId)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = findByUUID_G(uuid, groupId);

		return remove(lectureUpload);
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching lecture uploads
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"lectureUpload.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(lectureUpload.uuid IS NULL OR lectureUpload.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"lectureUpload.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching lecture uploads
	 */
	@Override
	public List<lectureUpload> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<lectureUpload> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<lectureUpload> list = null;

		if (useFinderCache) {
			list = (List<lectureUpload>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (lectureUpload lectureUpload : list) {
					if (!uuid.equals(lectureUpload.getUuid()) ||
						(companyId != lectureUpload.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<lectureUpload>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public lectureUpload findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the first lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<lectureUpload> orderByComparator) {

		List<lectureUpload> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public lectureUpload findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the last lecture upload in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<lectureUpload> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<lectureUpload> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public lectureUpload[] findByUuid_C_PrevAndNext(
			long uploadId, String uuid, long companyId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		uuid = Objects.toString(uuid, "");

		lectureUpload lectureUpload = findByPrimaryKey(uploadId);

		Session session = null;

		try {
			session = openSession();

			lectureUpload[] array = new lectureUploadImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, lectureUpload, uuid, companyId, orderByComparator,
				true);

			array[1] = lectureUpload;

			array[2] = getByUuid_C_PrevAndNext(
				session, lectureUpload, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected lectureUpload getByUuid_C_PrevAndNext(
		Session session, lectureUpload lectureUpload, String uuid,
		long companyId, OrderByComparator<lectureUpload> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						lectureUpload)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<lectureUpload> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lecture uploads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (lectureUpload lectureUpload :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(lectureUpload);
		}
	}

	/**
	 * Returns the number of lecture uploads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching lecture uploads
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LECTUREUPLOAD_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"lectureUpload.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(lectureUpload.uuid IS NULL OR lectureUpload.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"lectureUpload.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByG_G;
	private FinderPath _finderPathWithoutPaginationFindByG_G;
	private FinderPath _finderPathCountByG_G;

	/**
	 * Returns all the lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the matching lecture uploads
	 */
	@Override
	public List<lectureUpload> findByG_G(long groupId, long recordedlectureId) {
		return findByG_G(
			groupId, recordedlectureId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end) {

		return findByG_G(groupId, recordedlectureId, start, end, null);
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
	@Override
	public List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return findByG_G(
			groupId, recordedlectureId, start, end, orderByComparator, true);
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
	@Override
	public List<lectureUpload> findByG_G(
		long groupId, long recordedlectureId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByG_G;
				finderArgs = new Object[] {groupId, recordedlectureId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByG_G;
			finderArgs = new Object[] {
				groupId, recordedlectureId, start, end, orderByComparator
			};
		}

		List<lectureUpload> list = null;

		if (useFinderCache) {
			list = (List<lectureUpload>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (lectureUpload lectureUpload : list) {
					if ((groupId != lectureUpload.getGroupId()) ||
						(recordedlectureId !=
							lectureUpload.getRecordedlectureId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

			sb.append(_FINDER_COLUMN_G_G_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_G_RECORDEDLECTUREID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(recordedlectureId);

				list = (List<lectureUpload>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public lectureUpload findByG_G_First(
			long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByG_G_First(
			groupId, recordedlectureId, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", recordedlectureId=");
		sb.append(recordedlectureId);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the first lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByG_G_First(
		long groupId, long recordedlectureId,
		OrderByComparator<lectureUpload> orderByComparator) {

		List<lectureUpload> list = findByG_G(
			groupId, recordedlectureId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public lectureUpload findByG_G_Last(
			long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByG_G_Last(
			groupId, recordedlectureId, orderByComparator);

		if (lectureUpload != null) {
			return lectureUpload;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append(", recordedlectureId=");
		sb.append(recordedlectureId);

		sb.append("}");

		throw new NoSuchlectureUploadException(sb.toString());
	}

	/**
	 * Returns the last lecture upload in the ordered set where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchByG_G_Last(
		long groupId, long recordedlectureId,
		OrderByComparator<lectureUpload> orderByComparator) {

		int count = countByG_G(groupId, recordedlectureId);

		if (count == 0) {
			return null;
		}

		List<lectureUpload> list = findByG_G(
			groupId, recordedlectureId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public lectureUpload[] findByG_G_PrevAndNext(
			long uploadId, long groupId, long recordedlectureId,
			OrderByComparator<lectureUpload> orderByComparator)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = findByPrimaryKey(uploadId);

		Session session = null;

		try {
			session = openSession();

			lectureUpload[] array = new lectureUploadImpl[3];

			array[0] = getByG_G_PrevAndNext(
				session, lectureUpload, groupId, recordedlectureId,
				orderByComparator, true);

			array[1] = lectureUpload;

			array[2] = getByG_G_PrevAndNext(
				session, lectureUpload, groupId, recordedlectureId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected lectureUpload getByG_G_PrevAndNext(
		Session session, lectureUpload lectureUpload, long groupId,
		long recordedlectureId,
		OrderByComparator<lectureUpload> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_LECTUREUPLOAD_WHERE);

		sb.append(_FINDER_COLUMN_G_G_GROUPID_2);

		sb.append(_FINDER_COLUMN_G_G_RECORDEDLECTUREID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(lectureUploadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		queryPos.add(recordedlectureId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						lectureUpload)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<lectureUpload> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lecture uploads where groupId = &#63; and recordedlectureId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 */
	@Override
	public void removeByG_G(long groupId, long recordedlectureId) {
		for (lectureUpload lectureUpload :
				findByG_G(
					groupId, recordedlectureId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(lectureUpload);
		}
	}

	/**
	 * Returns the number of lecture uploads where groupId = &#63; and recordedlectureId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param recordedlectureId the recordedlecture ID
	 * @return the number of matching lecture uploads
	 */
	@Override
	public int countByG_G(long groupId, long recordedlectureId) {
		FinderPath finderPath = _finderPathCountByG_G;

		Object[] finderArgs = new Object[] {groupId, recordedlectureId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LECTUREUPLOAD_WHERE);

			sb.append(_FINDER_COLUMN_G_G_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_G_RECORDEDLECTUREID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(recordedlectureId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_G_GROUPID_2 =
		"lectureUpload.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_G_RECORDEDLECTUREID_2 =
		"lectureUpload.recordedlectureId = ?";

	public lectureUploadPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(lectureUpload.class);

		setModelImplClass(lectureUploadImpl.class);
		setModelPKClass(long.class);

		setTable(lectureUploadTable.INSTANCE);
	}

	/**
	 * Caches the lecture upload in the entity cache if it is enabled.
	 *
	 * @param lectureUpload the lecture upload
	 */
	@Override
	public void cacheResult(lectureUpload lectureUpload) {
		entityCache.putResult(
			lectureUploadImpl.class, lectureUpload.getPrimaryKey(),
			lectureUpload);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {lectureUpload.getUuid(), lectureUpload.getGroupId()},
			lectureUpload);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the lecture uploads in the entity cache if it is enabled.
	 *
	 * @param lectureUploads the lecture uploads
	 */
	@Override
	public void cacheResult(List<lectureUpload> lectureUploads) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (lectureUploads.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (lectureUpload lectureUpload : lectureUploads) {
			if (entityCache.getResult(
					lectureUploadImpl.class, lectureUpload.getPrimaryKey()) ==
						null) {

				cacheResult(lectureUpload);
			}
		}
	}

	/**
	 * Clears the cache for all lecture uploads.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(lectureUploadImpl.class);

		finderCache.clearCache(lectureUploadImpl.class);
	}

	/**
	 * Clears the cache for the lecture upload.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(lectureUpload lectureUpload) {
		entityCache.removeResult(lectureUploadImpl.class, lectureUpload);
	}

	@Override
	public void clearCache(List<lectureUpload> lectureUploads) {
		for (lectureUpload lectureUpload : lectureUploads) {
			entityCache.removeResult(lectureUploadImpl.class, lectureUpload);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(lectureUploadImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(lectureUploadImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		lectureUploadModelImpl lectureUploadModelImpl) {

		Object[] args = new Object[] {
			lectureUploadModelImpl.getUuid(),
			lectureUploadModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, lectureUploadModelImpl);
	}

	/**
	 * Creates a new lecture upload with the primary key. Does not add the lecture upload to the database.
	 *
	 * @param uploadId the primary key for the new lecture upload
	 * @return the new lecture upload
	 */
	@Override
	public lectureUpload create(long uploadId) {
		lectureUpload lectureUpload = new lectureUploadImpl();

		lectureUpload.setNew(true);
		lectureUpload.setPrimaryKey(uploadId);

		String uuid = _portalUUID.generate();

		lectureUpload.setUuid(uuid);

		lectureUpload.setCompanyId(CompanyThreadLocal.getCompanyId());

		return lectureUpload;
	}

	/**
	 * Removes the lecture upload with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload that was removed
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload remove(long uploadId)
		throws NoSuchlectureUploadException {

		return remove((Serializable)uploadId);
	}

	/**
	 * Removes the lecture upload with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lecture upload
	 * @return the lecture upload that was removed
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload remove(Serializable primaryKey)
		throws NoSuchlectureUploadException {

		Session session = null;

		try {
			session = openSession();

			lectureUpload lectureUpload = (lectureUpload)session.get(
				lectureUploadImpl.class, primaryKey);

			if (lectureUpload == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlectureUploadException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(lectureUpload);
		}
		catch (NoSuchlectureUploadException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected lectureUpload removeImpl(lectureUpload lectureUpload) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lectureUpload)) {
				lectureUpload = (lectureUpload)session.get(
					lectureUploadImpl.class, lectureUpload.getPrimaryKeyObj());
			}

			if (lectureUpload != null) {
				session.delete(lectureUpload);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (lectureUpload != null) {
			clearCache(lectureUpload);
		}

		return lectureUpload;
	}

	@Override
	public lectureUpload updateImpl(lectureUpload lectureUpload) {
		boolean isNew = lectureUpload.isNew();

		if (!(lectureUpload instanceof lectureUploadModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(lectureUpload.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					lectureUpload);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in lectureUpload proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom lectureUpload implementation " +
					lectureUpload.getClass());
		}

		lectureUploadModelImpl lectureUploadModelImpl =
			(lectureUploadModelImpl)lectureUpload;

		if (Validator.isNull(lectureUpload.getUuid())) {
			String uuid = _portalUUID.generate();

			lectureUpload.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (lectureUpload.getCreateDate() == null)) {
			if (serviceContext == null) {
				lectureUpload.setCreateDate(date);
			}
			else {
				lectureUpload.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!lectureUploadModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				lectureUpload.setModifiedDate(date);
			}
			else {
				lectureUpload.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(lectureUpload);
			}
			else {
				lectureUpload = (lectureUpload)session.merge(lectureUpload);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			lectureUploadImpl.class, lectureUploadModelImpl, false, true);

		cacheUniqueFindersCache(lectureUploadModelImpl);

		if (isNew) {
			lectureUpload.setNew(false);
		}

		lectureUpload.resetOriginalValues();

		return lectureUpload;
	}

	/**
	 * Returns the lecture upload with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlectureUploadException {

		lectureUpload lectureUpload = fetchByPrimaryKey(primaryKey);

		if (lectureUpload == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlectureUploadException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return lectureUpload;
	}

	/**
	 * Returns the lecture upload with the primary key or throws a <code>NoSuchlectureUploadException</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws NoSuchlectureUploadException if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload findByPrimaryKey(long uploadId)
		throws NoSuchlectureUploadException {

		return findByPrimaryKey((Serializable)uploadId);
	}

	/**
	 * Returns the lecture upload with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload, or <code>null</code> if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload fetchByPrimaryKey(long uploadId) {
		return fetchByPrimaryKey((Serializable)uploadId);
	}

	/**
	 * Returns all the lecture uploads.
	 *
	 * @return the lecture uploads
	 */
	@Override
	public List<lectureUpload> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<lectureUpload> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<lectureUpload> findAll(
		int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<lectureUpload> findAll(
		int start, int end, OrderByComparator<lectureUpload> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<lectureUpload> list = null;

		if (useFinderCache) {
			list = (List<lectureUpload>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LECTUREUPLOAD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LECTUREUPLOAD;

				sql = sql.concat(lectureUploadModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<lectureUpload>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the lecture uploads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (lectureUpload lectureUpload : findAll()) {
			remove(lectureUpload);
		}
	}

	/**
	 * Returns the number of lecture uploads.
	 *
	 * @return the number of lecture uploads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LECTUREUPLOAD);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "uploadId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LECTUREUPLOAD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return lectureUploadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lecture upload persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByG_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"groupId", "recordedlectureId"}, true);

		_finderPathWithoutPaginationFindByG_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_G",
			new String[] {Long.class.getName(), Long.class.getName()},
			new String[] {"groupId", "recordedlectureId"}, true);

		_finderPathCountByG_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_G",
			new String[] {Long.class.getName(), Long.class.getName()},
			new String[] {"groupId", "recordedlectureId"}, false);

		_setlectureUploadUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setlectureUploadUtilPersistence(null);

		entityCache.removeCache(lectureUploadImpl.class.getName());
	}

	private void _setlectureUploadUtilPersistence(
		lectureUploadPersistence lectureUploadPersistence) {

		try {
			Field field = lectureUploadUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, lectureUploadPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = RLPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = RLPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = RLPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LECTUREUPLOAD =
		"SELECT lectureUpload FROM lectureUpload lectureUpload";

	private static final String _SQL_SELECT_LECTUREUPLOAD_WHERE =
		"SELECT lectureUpload FROM lectureUpload lectureUpload WHERE ";

	private static final String _SQL_COUNT_LECTUREUPLOAD =
		"SELECT COUNT(lectureUpload) FROM lectureUpload lectureUpload";

	private static final String _SQL_COUNT_LECTUREUPLOAD_WHERE =
		"SELECT COUNT(lectureUpload) FROM lectureUpload lectureUpload WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "lectureUpload.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No lectureUpload exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No lectureUpload exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		lectureUploadPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}