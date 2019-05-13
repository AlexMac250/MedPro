package com.example.medpro;

import java.util.Date;
/**
 * @author Aleksandr Vasilenko
 * @version 1.0
 */
public class Profile {

    private String id;
    String FIO;
    Date birthday;
    String diagnosis;


    /** Молочные железы развиты правильно?*/
    public boolean breast_development_is_right;
    /** Молочные железы симметричны? */
    public boolean is_symmetric;
    /** Причина деформации */
    public String breast_development_cause;
    /** Тип деформации */
    public String breast_development_deformation_type;
    /** Иной тип деформации (отсутствие)*/
    public String breast_development_deformation_other_type;

    /** Локализация добавочных молочных желёз */
    public boolean extension_of_the_mammary_glands_left;
    public boolean extension_of_the_mammary_glands_leftDown;
    public boolean extension_of_the_mammary_glands_center;
    public boolean extension_of_the_mammary_glands_rightDown;
    public boolean extension_of_the_mammary_glands_right;



    /** Структура однородна? */
    public boolean structure_is_homogeneous;

    /** Есть ли узловые образования */
    public boolean is_nodal_formation;
    /** Размер узлового образования */
    public int size_of_nodal_formation;
    /** Участки узлового образования */
    public boolean leftUp_nodal_formation = false;
    public boolean rightUp_nodal_formation = false;
    public boolean leftDown_nodal_formation = false;
    public boolean rightDown_nodal_formation = false;
    public boolean leftCenterUp_nodal_formation = false;
    public boolean rightCenterUp_nodal_formation = false;
    public boolean leftCenterDown_nodal_formation = false;
    public boolean rightCenterDown_nodal_formation = false;
    /** Структура узлового образования */
    public String structure_of_nodal_formation;
    /** Контур узлового образования */
    public String contours_of_nodal_formation;


    /** Выделения из соска молочной железы */
    public boolean discharge_from_the_nipple;
    /** Степень выделений */
    public int degree_of_discharge_from_the_nipple;
    /** Выделения из какой молочной железы */
    public String direction_of_discharge_from_the_nipple;
    /** Множественность выделений (Из одного/Из нескольких протоков) */
    public String count_of_discharge_from_the_nipple;
    /** Цвет выделений */
    public String color_of_discharge_from_the_nipple;


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Profile{\n" +
                "\tid='" + id + "'\n" +
                "\tFIO='" + FIO + "'\n" +
                "\tbirthday=" + birthday + "\n" +
                "\tdiagnosis='" + diagnosis + "'\n" +
                "\tbreast_development_is_right=" + breast_development_is_right + "\n"  +
                "\tis_symmetric=" + is_symmetric + "\n"  +
                "\tbreast_development_cause='" + breast_development_cause + "'\n" +
                "\tbreast_development_deformation_type='" + breast_development_deformation_type + "'\n" +
                "\tbreast_development_deformation_other_type='" + breast_development_deformation_other_type + "'\n" +
                "\tstructure_is_homogeneous=" + structure_is_homogeneous + "\n"  +
                "\tis_nodal_formation=" + is_nodal_formation + "\n"  +
                "\tsize_of_nodal_formation=" + size_of_nodal_formation + "\n\n"  +
                "\tleftUp_nodal_formation=" + leftUp_nodal_formation + "\n"  +
                "\trightUp_nodal_formation=" + rightUp_nodal_formation + "\n"  +
                "\tleftDown_nodal_formation=" + leftDown_nodal_formation + "\n"  +
                "\trightDown_nodal_formation=" + rightDown_nodal_formation + "\n"  +
                "\tleftCenterUp_nodal_formation=" + leftCenterUp_nodal_formation + "\n"  +
                "\trightCenterUp_nodal_formation=" + rightCenterUp_nodal_formation + "\n"  +
                "\tleftCenterDown_nodal_formation=" + leftCenterDown_nodal_formation + "\n"  +
                "\trightCenterDown_nodal_formation=" + rightCenterDown_nodal_formation + "\n\n"  +
                "\tstructure_of_nodal_formation='" + structure_of_nodal_formation + "'\n" +
                "\tcontours_of_nodal_formation='" + contours_of_nodal_formation + "'\n" +
                "\tdischarge_from_the_nipple=" + discharge_from_the_nipple + "\n"  +
                "\tdegree_of_discharge_from_the_nipple=" + degree_of_discharge_from_the_nipple + "\n"  +
                "\tdirection_of_discharge_from_the_nipple='" + direction_of_discharge_from_the_nipple + "'\n" +
                "\tcount_of_discharge_from_the_nipple='" + count_of_discharge_from_the_nipple + "'\n" +
                "\tcolor_of_discharge_from_the_nipple='" + color_of_discharge_from_the_nipple + "'\n" +
                '}';
    }

    /**
     * Конструктор класса {@code Profile}
     * @param id
     *      ID Пациета
     */
    public Profile(String id) {
        this.id = id;
    }
}

