package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        Category[] categories ={ new Category(1,"Programlama")};
        for (Category c : categories) {
            if (category.getName() == c.getName()){
                throw new Exception("Kategori ismi tekrar edilemez");
            }
        }

        categoryDao.add(category);

        for (Logger logger : loggers){
            logger.log(category.getName());
        }


    }
}
