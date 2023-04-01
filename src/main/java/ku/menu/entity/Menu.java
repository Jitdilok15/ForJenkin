package ku.menu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;


@Entity
@Data
@ToString
public class Menu {

    @Id  //ใช้สร้าง ID สำหรับ UUID
    @GeneratedValue //ใช้เพื่อ generate ข้อมูล UUID
    private UUID id;

    private String name;
    private double price;
    private String category;



}
