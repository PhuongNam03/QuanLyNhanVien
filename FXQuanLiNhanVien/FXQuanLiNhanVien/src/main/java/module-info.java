module com.nvn.fxquanlinhanvien {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    opens com.nvn.fxquanlinhanvien to javafx.fxml;
    exports com.nvn.fxquanlinhanvien;
    exports com.pojo;
}
