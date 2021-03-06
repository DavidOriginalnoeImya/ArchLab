package categoryController;

import categorydto.CategoryWithNewsDTO;

import java.util.List;

public interface ICategoryController {
    public List<NewsCategory> getCategoryList();
    public void addCategory(NewsCategory news);
    public void refreshCategory(Integer id, String newName);
    public void deleteCategory(Integer id);
    public CategoryWithNewsDTO getCategoryWithNews(List<NewsCategory> categories);
}
