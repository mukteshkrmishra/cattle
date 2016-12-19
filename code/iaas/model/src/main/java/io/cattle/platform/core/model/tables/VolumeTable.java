/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VolumeTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.VolumeRecord> {

	private static final long serialVersionUID = 1693280794;

	/**
	 * The singleton instance of <code>cattle.volume</code>
	 */
	public static final io.cattle.platform.core.model.tables.VolumeTable VOLUME = new io.cattle.platform.core.model.tables.VolumeTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.VolumeRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.VolumeRecord.class;
	}

	/**
	 * The column <code>cattle.volume.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.volume.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.volume.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.volume.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.volume.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.volume.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.volume.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.volume.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.volume.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.volume.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.volume.physical_size_mb</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> PHYSICAL_SIZE_MB = createField("physical_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.virtual_size_mb</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> VIRTUAL_SIZE_MB = createField("virtual_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.device_number</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Integer> DEVICE_NUMBER = createField("device_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>cattle.volume.format</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.volume.allocation_state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> ALLOCATION_STATE = createField("allocation_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.volume.attached_state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> ATTACHED_STATE = createField("attached_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.volume.instance_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.image_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.zone_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.uri</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>cattle.volume.external_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>cattle.volume.access_mode</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.String> ACCESS_MODE = createField("access_mode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.volume.host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.deployment_unit_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> DEPLOYMENT_UNIT_ID = createField("deployment_unit_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.environment_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.volume_template_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> VOLUME_TEMPLATE_ID = createField("volume_template_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.storage_driver_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> STORAGE_DRIVER_ID = createField("storage_driver_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.volume.size_mb</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> SIZE_MB = createField("size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.volume</code> table reference
	 */
	public VolumeTable() {
		this("volume", null);
	}

	/**
	 * Create an aliased <code>cattle.volume</code> table reference
	 */
	public VolumeTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.VolumeTable.VOLUME);
	}

	private VolumeTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.VolumeRecord> aliased) {
		this(alias, aliased, null);
	}

	private VolumeTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.VolumeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.VolumeRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_VOLUME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.VolumeRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_VOLUME_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.VolumeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.VolumeRecord>>asList(io.cattle.platform.core.model.Keys.KEY_VOLUME_PRIMARY, io.cattle.platform.core.model.Keys.KEY_VOLUME_IDX_VOLUME_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.VolumeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.VolumeRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_VOLUME__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__INSTANCE_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__IMAGE_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__ZONE_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__HOST_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__DEPLOYMENT_UNIT_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__VOLUME_TEMPLATE_ID, io.cattle.platform.core.model.Keys.FK_VOLUME__STORAGE_DRIVER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.VolumeTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.VolumeTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.VolumeTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.VolumeTable(name, null);
	}
}
