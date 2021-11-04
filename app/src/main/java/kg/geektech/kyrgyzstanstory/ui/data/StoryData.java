package kg.geektech.kyrgyzstanstory.ui.data;

import java.util.ArrayList;

import kg.geektech.kyrgyzstanstory.ui.models.StoryModel;

public class StoryData {
    private ArrayList<StoryModel>list;

    public ArrayList<StoryModel> getList() {
        list = new ArrayList<>();
        list.add(new StoryModel("История Киргизии"));
        list.add(new StoryModel("1. Доисторический период"));
        list.add(new StoryModel("2. Древний период и раннее Средневековье"));
        list.add(new StoryModel("3. Этногенез киргизского народа"));
        list.add(new StoryModel("3.1. Древнекиргизский компонент"));
        list.add(new StoryModel("3.1.1. Алтайская концепция появления киргизов на Тянь-Шане"));
        list.add(new StoryModel("3.1.2. Восточнотуркестанская концепция появления киргизов на Тянь-Шане"));
        list.add(new StoryModel("3.2. Огузо-карлукский компонент"));
        list.add(new StoryModel("3.3. Могольский компонен"));
        list.add(new StoryModel("3.3.1. Киргизы и ойратский союз"));
        list.add(new StoryModel("3.4. Роль ислама в этногенезе киргизов"));
        list.add(new StoryModel("4. Казахско-киргизский военный союз в XVI—XVII вв"));
        list.add(new StoryModel("5. Экспансия Джунгарского ханства"));
        list.add(new StoryModel("6. Конфликты с казахами в XVIII веке"));
        list.add(new StoryModel("7. Киргизы в составе Кокандского ханства"));
        list.add(new StoryModel("7.1. Вторжение Кенесары"));
        list.add(new StoryModel("8. В составе Российской империи"));
        list.add(new StoryModel("9. Туркестанская автономия и движение «Алаш»"));
        list.add(new StoryModel("9.1. Киргизы в движении «Алаш»"));
        list.add(new StoryModel("10. Киргизия в 1922—1941 годы"));
        list.add(new StoryModel("11. Киргизия в Великой Отечественной войне"));
        list.add(new StoryModel("12. Киргизия в 1945—1991 годы"));
        list.add(new StoryModel("13.1. Первые годы независимости"));
        list.add(new StoryModel("13.2. Баткенские события 1999 года"));
        list.add(new StoryModel("13.3. Американская авиабаза «Манас»"));
        list.add(new StoryModel("13.4. Аксыйские события и «Тюльпановая революция»"));
        list.add(new StoryModel("13.5. Свержение Бакиева и беспорядки на юге Киргизии"));
        list.add(new StoryModel("13.6. Правление Атамбаева и Жээнбекова"));
        list.add(new StoryModel("13.7. Противостояние Жээнбекова и экс-президента Атамбаева"));
        list.add(new StoryModel("13.8. Пандемия 2020 года в Киргизии"));
        list.add(new StoryModel("13.9. Политический кризис 5—16 октября 2020 года"));
        list.add(new StoryModel("13.10. Правление Садыра Жапарова"));
        return list;
    }
}
