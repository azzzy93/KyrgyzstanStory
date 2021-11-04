package kg.geektech.kyrgyzstanstory.ui.data;

import java.util.ArrayList;

import kg.geektech.kyrgyzstanstory.ui.models.RegionModel;

public class RegionData {
    ArrayList<RegionModel>list;

    public ArrayList<RegionModel> getList() {
        list = new ArrayList<>();
        list.add(new RegionModel("Бишкек"));
        list.add(new RegionModel("Ош"));
        list.add(new RegionModel("1. Баткенская область"));
        list.add(new RegionModel("2. Джалал-Абадская область"));
        list.add(new RegionModel("3. Иссык-Кульская область"));
        list.add(new RegionModel("4. Нарынская область"));
        list.add(new RegionModel("5. Ошская область"));
        list.add(new RegionModel("6. Таласская область"));
        list.add(new RegionModel("7. Чуйская область"));
        return list;
    }
}
