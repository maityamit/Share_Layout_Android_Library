package sharelayoutbyamit.example.sharelibrary;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.io.ByteArrayOutputStream;
import java.util.Calendar;

public class ShareLayout {

    public static void simpleLayoutShare(Context ctx, View view ,String msg){

        //Capture the Screenshot
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);

        //Change into Bitmap
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String pathofBmp = MediaStore.Images.Media.insertImage(ctx.getContentResolver(), bitmap , "IMG_" + Calendar.getInstance().getTime(), null);


        //Share through Intent
        Uri uri = Uri.parse(pathofBmp);
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        shareIntent.putExtra(Intent.EXTRA_TEXT, msg
        );
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        ctx.startActivity(Intent.createChooser(shareIntent, "hello hello"));


    }


}
