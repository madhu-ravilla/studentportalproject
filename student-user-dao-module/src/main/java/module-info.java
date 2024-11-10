module com.ravilla.student.userdao {
    
    requires com.ravilla.student.entity;
    requires com.ravilla.student.dao;
    provides com.ravilla.student.dao.Dao with com.ravilla.student.userdao.UserDao;
    
    exports com.ravilla.student.userdao;

}
