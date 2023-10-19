package AccessModifiers;

import AccessModifiers.Package1.Person;

//Lesson 28
//public, private, default (Все что default достпно в пределах этого пакета)
// protected (доступны в пределах одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета)
public class Test extends Person{
    protected int id;
    Test(){
        name = "Tom";
    }
}
