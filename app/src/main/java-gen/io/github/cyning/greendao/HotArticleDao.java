package io.github.cyning.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import io.github.cyning.greendao.HotArticle;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HOT_ARTICLE".
*/
public class HotArticleDao extends AbstractDao<HotArticle, String> {

    public static final String TABLENAME = "HOT_ARTICLE";

    /**
     * Properties of entity HotArticle.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property GroupName = new Property(0, String.class, "groupName", false, "GROUP_NAME");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property AbstractX = new Property(2, String.class, "abstractX", false, "ABSTRACT_X");
        public final static Property SerNo = new Property(3, String.class, "serNo", false, "SER_NO");
        public final static Property Category = new Property(4, String.class, "category", false, "CATEGORY");
        public final static Property Link = new Property(5, String.class, "link", true, "LINK");
        public final static Property ImgUrl = new Property(6, String.class, "imgUrl", false, "IMG_URL");
        public final static Property UpdateTime = new Property(7, String.class, "updateTime", false, "UPDATE_TIME");
    };

    private DaoSession daoSession;


    public HotArticleDao(DaoConfig config) {
        super(config);
    }
    
    public HotArticleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HOT_ARTICLE\" (" + //
                "\"GROUP_NAME\" TEXT," + // 0: groupName
                "\"TITLE\" TEXT," + // 1: title
                "\"ABSTRACT_X\" TEXT," + // 2: abstractX
                "\"SER_NO\" TEXT," + // 3: serNo
                "\"CATEGORY\" TEXT," + // 4: category
                "\"LINK\" TEXT PRIMARY KEY NOT NULL ," + // 5: link
                "\"IMG_URL\" TEXT," + // 6: imgUrl
                "\"UPDATE_TIME\" TEXT);"); // 7: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HOT_ARTICLE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HotArticle entity) {
        stmt.clearBindings();
 
        String groupName = entity.getGroupName();
        if (groupName != null) {
            stmt.bindString(1, groupName);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String abstractX = entity.getAbstractX();
        if (abstractX != null) {
            stmt.bindString(3, abstractX);
        }
 
        String serNo = entity.getSerNo();
        if (serNo != null) {
            stmt.bindString(4, serNo);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(5, category);
        }
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(6, link);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(7, imgUrl);
        }
 
        String updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindString(8, updateTime);
        }
    }

    @Override
    protected void attachEntity(HotArticle entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5);
    }    

    /** @inheritdoc */
    @Override
    public HotArticle readEntity(Cursor cursor, int offset) {
        HotArticle entity = new HotArticle( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // groupName
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // abstractX
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // serNo
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // category
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // link
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // imgUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // updateTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HotArticle entity, int offset) {
        entity.setGroupName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAbstractX(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSerNo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCategory(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLink(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setImgUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUpdateTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(HotArticle entity, long rowId) {
        return entity.getLink();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(HotArticle entity) {
        if(entity != null) {
            return entity.getLink();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
