package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DaoFactory {

    @Contract(value = " -> new", pure = true)
    public static @NotNull SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }

    @Contract(value = " -> new", pure = true)
    public static @NotNull DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC();
    }
}
