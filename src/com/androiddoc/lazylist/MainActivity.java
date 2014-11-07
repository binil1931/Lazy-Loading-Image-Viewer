package com.androiddoc.lazylist;

import com.fedorvlasov.lazylist.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
    
    ListView list;
    LazyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        list=(ListView)findViewById(R.id.list);
        adapter=new LazyAdapter(this, mStrings);
        list.setAdapter(adapter);
        
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(listener);
    }
    
    @Override
    public void onDestroy()
    {
        list.setAdapter(null);
        super.onDestroy();
    }
    
    public OnClickListener listener=new OnClickListener(){
        @Override
        public void onClick(View arg0) {
            adapter.imageLoader.clearCache();
            adapter.notifyDataSetChanged();
        }
    };
    
    private String[] mStrings={
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg",
            "http://webneel.com/wallpaper/sites/default/files/images/04-2013/clean-sky-wallpaper.jpg",
            "http://www.w8themes.com/wp-content/uploads/2013/08/HD-Wallpaper-Nature.jpg",
            "http://felnottkepzes.hu/wp-content/uploads/A-Du%C3%A1lis-Szakk%C3%A9pz%C3%A9s%C3%A9-a-j%C3%B6v%C5%91.jpg",
            "http://i.imgur.com/fgI4k.jpg",
            "http://media02.hongkiat.com/ww-flower-wallpapers/sunflower-landscape.jpg"
    };
}