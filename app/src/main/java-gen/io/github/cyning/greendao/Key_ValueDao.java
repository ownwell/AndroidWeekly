package io.github.cyning.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import io.github.cyning.greendao.Key_Value;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "KEY__VALUE".
*/
public class Key_ValueDao extends AbstractDao<Key_Value, Void> {

    public static final String TABLENAME = "KEY__VALUE";

    /**
     * Properties of entity Key_Value.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Key = new Property(0, String.class, "key", false, "KEY");
        public final static Property Value = new Property(1, String.class, "value", false, "VALUE");
    };

    private DaoSession daoSession;


    public Key_ValueDao(DaoConfig config) {
        super(config);
    }
    
    public Key_ValueDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"KEY__VALUE\" (" + //
                "\"KEY\" TEXT," + // 0: key
                "\"VALUE\" TEXT);"); // 1: value
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"KEY__VALUE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Key_Value entity) {
        stmt.clearBindings();
 
        String key = entity.getKey();
        if (key != null) {
            stmt.bindString(1, key);
        }
 
        String value = entity.getValue();
        if (value != null) {
            stmt.bindString(2, value);
        }
    }

    @Override
    protected void attachEntity(Key_Value entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public Key_Value readEntity(Cursor cursor, int offset) {
        Key_Value entity = new Key_Value( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // key
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // value
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Key_Value entity, int offset) {
        entity.setKey(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setValue(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(Key_Value entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(Key_Value entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
