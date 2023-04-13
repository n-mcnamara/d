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

package com.liferay.docs.recordedlectures.service.base;

import com.liferay.docs.recordedlectures.model.lectureUpload;
import com.liferay.docs.recordedlectures.service.lectureUploadLocalService;
import com.liferay.docs.recordedlectures.service.lectureUploadLocalServiceUtil;
import com.liferay.docs.recordedlectures.service.persistence.LecturePersistence;
import com.liferay.docs.recordedlectures.service.persistence.lectureUploadPersistence;
import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandler;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerRegistryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the lecture upload local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.recordedlectures.service.impl.lectureUploadLocalServiceImpl}.
 * </p>
 *
 * @author liferay
 * @see com.liferay.docs.recordedlectures.service.impl.lectureUploadLocalServiceImpl
 * @generated
 */
public abstract class lectureUploadLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, lectureUploadLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>lectureUploadLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>lectureUploadLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public lectureUpload addlectureUpload(lectureUpload lectureUpload) {
		lectureUpload.setNew(true);

		return lectureUploadPersistence.update(lectureUpload);
	}

	/**
	 * Creates a new lecture upload with the primary key. Does not add the lecture upload to the database.
	 *
	 * @param uploadId the primary key for the new lecture upload
	 * @return the new lecture upload
	 */
	@Override
	@Transactional(enabled = false)
	public lectureUpload createlectureUpload(long uploadId) {
		return lectureUploadPersistence.create(uploadId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public lectureUpload deletelectureUpload(long uploadId)
		throws PortalException {

		return lectureUploadPersistence.remove(uploadId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public lectureUpload deletelectureUpload(lectureUpload lectureUpload) {
		return lectureUploadPersistence.remove(lectureUpload);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return lectureUploadPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			lectureUpload.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return lectureUploadPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return lectureUploadPersistence.findWithDynamicQuery(
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return lectureUploadPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return lectureUploadPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return lectureUploadPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public lectureUpload fetchlectureUpload(long uploadId) {
		return lectureUploadPersistence.fetchByPrimaryKey(uploadId);
	}

	/**
	 * Returns the lecture upload matching the UUID and group.
	 *
	 * @param uuid the lecture upload's UUID
	 * @param groupId the primary key of the group
	 * @return the matching lecture upload, or <code>null</code> if a matching lecture upload could not be found
	 */
	@Override
	public lectureUpload fetchlectureUploadByUuidAndGroupId(
		String uuid, long groupId) {

		return lectureUploadPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the lecture upload with the primary key.
	 *
	 * @param uploadId the primary key of the lecture upload
	 * @return the lecture upload
	 * @throws PortalException if a lecture upload with the primary key could not be found
	 */
	@Override
	public lectureUpload getlectureUpload(long uploadId)
		throws PortalException {

		return lectureUploadPersistence.findByPrimaryKey(uploadId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(lectureUploadLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(lectureUpload.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("uploadId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			lectureUploadLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(lectureUpload.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("uploadId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(lectureUploadLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(lectureUpload.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("uploadId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					Criterion modifiedDateCriterion =
						portletDataContext.getDateRangeCriteria("modifiedDate");

					Criterion statusDateCriterion =
						portletDataContext.getDateRangeCriteria("statusDate");

					if ((modifiedDateCriterion != null) &&
						(statusDateCriterion != null)) {

						Disjunction disjunction =
							RestrictionsFactoryUtil.disjunction();

						disjunction.add(modifiedDateCriterion);
						disjunction.add(statusDateCriterion);

						dynamicQuery.add(disjunction);
					}

					Property workflowStatusProperty =
						PropertyFactoryUtil.forName("status");

					if (portletDataContext.isInitialPublication()) {
						dynamicQuery.add(
							workflowStatusProperty.ne(
								WorkflowConstants.STATUS_IN_TRASH));
					}
					else {
						StagedModelDataHandler<?> stagedModelDataHandler =
							StagedModelDataHandlerRegistryUtil.
								getStagedModelDataHandler(
									lectureUpload.class.getName());

						dynamicQuery.add(
							workflowStatusProperty.in(
								stagedModelDataHandler.
									getExportableStatuses()));
					}
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<lectureUpload>() {

				@Override
				public void performAction(lectureUpload lectureUpload)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, lectureUpload);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(lectureUpload.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return lectureUploadPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement lectureUploadLocalServiceImpl#deletelectureUpload(lectureUpload) to avoid orphaned data");
		}

		return lectureUploadLocalService.deletelectureUpload(
			(lectureUpload)persistedModel);
	}

	@Override
	public BasePersistence<lectureUpload> getBasePersistence() {
		return lectureUploadPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return lectureUploadPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the lecture uploads matching the UUID and company.
	 *
	 * @param uuid the UUID of the lecture uploads
	 * @param companyId the primary key of the company
	 * @return the matching lecture uploads, or an empty list if no matches were found
	 */
	@Override
	public List<lectureUpload> getlectureUploadsByUuidAndCompanyId(
		String uuid, long companyId) {

		return lectureUploadPersistence.findByUuid_C(uuid, companyId);
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
	public List<lectureUpload> getlectureUploadsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<lectureUpload> orderByComparator) {

		return lectureUploadPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public lectureUpload getlectureUploadByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return lectureUploadPersistence.findByUUID_G(uuid, groupId);
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
	public List<lectureUpload> getlectureUploads(int start, int end) {
		return lectureUploadPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of lecture uploads.
	 *
	 * @return the number of lecture uploads
	 */
	@Override
	public int getlectureUploadsCount() {
		return lectureUploadPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public lectureUpload updatelectureUpload(lectureUpload lectureUpload) {
		return lectureUploadPersistence.update(lectureUpload);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			lectureUploadLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		lectureUploadLocalService = (lectureUploadLocalService)aopProxy;

		_setLocalServiceUtilService(lectureUploadLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return lectureUploadLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return lectureUpload.class;
	}

	protected String getModelClassName() {
		return lectureUpload.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = lectureUploadPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		lectureUploadLocalService lectureUploadLocalService) {

		try {
			Field field = lectureUploadLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, lectureUploadLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected LecturePersistence lecturePersistence;

	protected lectureUploadLocalService lectureUploadLocalService;

	@Reference
	protected lectureUploadPersistence lectureUploadPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		lectureUploadLocalServiceBaseImpl.class);

}