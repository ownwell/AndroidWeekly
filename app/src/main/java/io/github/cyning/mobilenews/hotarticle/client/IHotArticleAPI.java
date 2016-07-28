package io.github.cyning.mobilenews.hotarticle.client;

import java.util.List;

import io.github.cyning.mobilenews.hotarticle.model.HotArticleData;
import io.github.cyning.mobilenews.hotarticle.model.PatchBean;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Cyning
 * @since 2016.03.03
 * Time    12:56 PM
 * Desc    <p>类/接口描述</p>
 */

public interface IHotArticleAPI {


    @GET("https://api.leancloud.cn/1.1/classes/WeekArticle")
    Observable<HotArticleData> getHotArticle(@Query("order") String order,@Query("where") String where,@Header("X-LC-Sign")String sign);

    @GET("https://api.leancloud.cn/1.1/classes/PatchBean")
    Observable<List<PatchBean>> checkPatch(@Query("where") String where,@Header("X-LC-Sign")String sign);

}
