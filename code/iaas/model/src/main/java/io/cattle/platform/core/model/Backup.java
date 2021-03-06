/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "backup", schema = "cattle")
public interface Backup extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.backup.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.backup.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.backup.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.backup.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.backup.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.backup.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.backup.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.backup.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.backup.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.backup.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.backup.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.backup.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.backup.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.backup.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.backup.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.backup.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.backup.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.backup.snapshot_id</code>.
	 */
	public void setSnapshotId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.backup.snapshot_id</code>.
	 */
	@javax.persistence.Column(name = "snapshot_id", precision = 19)
	public java.lang.Long getSnapshotId();

	/**
	 * Setter for <code>cattle.backup.volume_id</code>.
	 */
	public void setVolumeId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.backup.volume_id</code>.
	 */
	@javax.persistence.Column(name = "volume_id", precision = 19)
	public java.lang.Long getVolumeId();

	/**
	 * Setter for <code>cattle.backup.backup_target_id</code>.
	 */
	public void setBackupTargetId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.backup.backup_target_id</code>.
	 */
	@javax.persistence.Column(name = "backup_target_id", precision = 19)
	public java.lang.Long getBackupTargetId();

	/**
	 * Setter for <code>cattle.backup.uri</code>.
	 */
	public void setUri(java.lang.String value);

	/**
	 * Getter for <code>cattle.backup.uri</code>.
	 */
	@javax.persistence.Column(name = "uri", length = 4096)
	public java.lang.String getUri();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Backup
	 */
	public void from(io.cattle.platform.core.model.Backup from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Backup
	 */
	public <E extends io.cattle.platform.core.model.Backup> E into(E into);
}
