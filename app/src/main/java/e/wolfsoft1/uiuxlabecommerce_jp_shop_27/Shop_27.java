package e.wolfsoft1.uiuxlabecommerce_jp_shop_27;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.adapter.ColorAdapter_27;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.adapter.Pants_ViewpagerAdapter_Shop27;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.adapter.SizeAdapter_27;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.model.Color_Model_27;
import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.model.Size_Model_27;


public class Shop_27 extends AppCompatActivity {

    RecyclerView recyclrerview_size27;
    ArrayList<Size_Model_27> size_modelArrayList;
    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L"};

    ViewPager pantsViewpager_shop27;
    RecyclerView recyclrerview_color27;
    private Integer color[] = {R.drawable.ic_color27_1, R.drawable.ic_color_dark, R.drawable.ic_color27_3, R.drawable.ic_color27_4, R.drawable.ic_color27_5, R.drawable.ic_color27_6, R.drawable.ic_color27_7};
    ArrayList<Color_Model_27> color_modelArrayList;
    LinePageIndicator indicator_line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_27);

        indicator_line = findViewById(R.id.indicator_line);
        pantsViewpager_shop27 = findViewById(R.id.pantsViewpager_shop27);

        recyclrerview_size27 = findViewById(R.id.recyclrerview_size27);
        recyclrerview_color27 = findViewById(R.id.recyclrerview_color27);

        Pants_ViewpagerAdapter_Shop27 pantsViewpagerAdapter = new Pants_ViewpagerAdapter_Shop27(getSupportFragmentManager(), 3);
        pantsViewpager_shop27.setAdapter(pantsViewpagerAdapter);
        indicator_line.setViewPager(pantsViewpager_shop27);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model_27 size_model = new Size_Model_27(size[i]);
            size_modelArrayList.add(size_model);
        }
        recyclrerview_size27.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_27 sizeAdapter = new SizeAdapter_27(this, size_modelArrayList);
        recyclrerview_size27.setAdapter(sizeAdapter);

        color_modelArrayList = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            Color_Model_27 color_model = new Color_Model_27(color[i]);
            color_modelArrayList.add(color_model);
        }

        recyclrerview_color27.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_27 adapter = new ColorAdapter_27(this, color_modelArrayList);
        recyclrerview_color27.setAdapter(adapter);

    }
}
