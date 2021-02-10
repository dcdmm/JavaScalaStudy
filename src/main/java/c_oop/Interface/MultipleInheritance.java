package c_oop.Interface;

/**
 * 接口:通过继承(即通过extends关键字),可以很容易地在接口中添加新的方法声明,还可以通过继承在新接口中组合数个接口
 */
public interface MultipleInheritance {
    void menace();
}

// 接口只能继承(extends)接口,不能继承抽象类
interface DangerousMonster extends MultipleInheritance {
    void menace(int num); // 重写针对的是类,不包括接口

    void destory();
}


interface Lethal {
    void kill();
}


class DragonZilla implements DangerousMonster {

    @Override
    public void menace() {
    }

    @Override
    public void menace(int num) {

    }

    @Override
    public void destory() {
    }
}


// 多重继承(仅适用于接口继承)
// 注意:在打算组合的不同接口中使用相同的方法名通常会造成代码可读性的混乱,尽量避免这种情况
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}


class VeryBadVampire implements Vampire {

    @Override
    public void menace() {
    }

    @Override
    public void menace(int num) {
    }

    @Override
    public void destory() {
    }

    @Override
    public void kill() {
    }

    @Override
    public void drinkBlood() {
    }
}