package ahmadrosid.com.mvvm.api;

import ahmadrosid.com.mvvm.model.api.JadwalBioskop;
import ahmadrosid.com.mvvm.model.api.ListKota;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public interface ApiServices {


    @GET("/api/jadwal-bioskop?k=24674091d271b5ed8a783b4965798b04")
    Observable<ListKota> getListKota();

    @GET("/api/jadwal-bioskop?k=24674091d271b5ed8a783b4965798b04")
    Observable<JadwalBioskop> getjadwalBioskop(@Query("id") int id);
}
