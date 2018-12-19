package com.qindadai.myperformance.demo1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.qindadai.myperformance.R;
import com.qindadai.myperformance.Router;

/**
 * Created by Alex
 * time: 2018/12/17  4:28 PM
 * Description: This is Demo1Activity
 * Func for 高效加载 bitmap
 */
@Route(path = Router.ROUTERDEMO1)
public class Demo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        test();
    }

    private void test() {
        decodeBitmap();
        options();

    }

    private void options() {
                BitmapFactory.Options options = new BitmapFactory.Options();
                //三个重要 属性
//                options.inJustDecodeBounds
//                options.outWidth  options.outHeight
//                options.inSampleSize



    }

    private void decodeBitmap() {

        Bitmap bitmap = BitmapFactory.decodeResource(getResources() , R.mipmap.ic_launcher , null);
//        Bitmap bitmap = BitmapFactory.decodeByteArray(getResources() , R.mipmap.ic_launcher , null);
//        Bitmap bitmap = BitmapFactory.decodeFile(getResources() , R.mipmap.ic_launcher , null);
//        Bitmap bitmap = BitmapFactory.decodeStream(getResources() , R.mipmap.ic_launcher , null);

        //  api
        Bitmap bitmap1 = bitmap.extractAlpha();

        bitmap.getHeight();
        bitmap.getWidth();

        //高效加载bitmap
        //why?
//        内存溢出
//        节省内存开销
//        应用流畅

    }
}
