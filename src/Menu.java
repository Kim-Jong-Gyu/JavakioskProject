public class Menu {
    private int menuId;
    private String menuName;
    private String menuDesc;

    public Menu(int menuId, String menuName, String menuDesc) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuDesc = menuDesc;
    }

    public int getMenuId() {
        return menuId;
    }


    public String getMenuName() {
        return menuName;
    }


    public String getMenuDesc() {
        return menuDesc;
    }
}
