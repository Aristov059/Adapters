package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Cars> car = new ArrayList<Cars>();
        if(car.size()==0){
            car.add(new Cars("lamborghini", "шт."));
            car.add(new Cars("Jaguar", "шт."));
            car.add(new Cars("Mercedes", "шт."));
            car.add(new Cars("BMW", "шт."));
            car.add(new Cars("Subaru", "шт."));
            car.add(new Cars("Ford", "шт."));
            car.add(new Cars("KIA", "шт."));
            car.add(new Cars("Bentley", "шт."));
            car.add(new Cars("Volkswagen", "шт."));
        }
        ListView productList = findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_cars, car);
        productList.setAdapter(adapter);
    }
}
