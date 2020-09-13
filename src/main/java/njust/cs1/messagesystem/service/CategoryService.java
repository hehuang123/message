package njust.cs1.messagesystem.service;

import njust.cs1.messagesystem.dao.CategoryDao;
import njust.cs1.messagesystem.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDAO;

    /**
     * 将图书列表根据id排序
     * @return 排序过后的图书列表
     */
    public List<Category> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    /**
     * 获取图书id信息
     * @param id 图书id信息
     * @return 查询是否库中有此id信息，没有则添加，有则返回。
     */
    public Category get(int id) {
        return categoryDAO.findById(id).orElse(null);
    }
}
