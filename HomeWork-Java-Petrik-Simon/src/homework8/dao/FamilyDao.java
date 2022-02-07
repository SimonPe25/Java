package homework8.dao;

import homework8.Family;

public interface FamilyDao {


     void getAllFamilies();
     void getFamilyByIndex(int index);
     void deleteFamily(int index);
     void deleteFamily(Family family);
     void saveFamily(Family family);

}

       // getAllFamilies - возвращает проиндексированный список всех семей (List).

        //getFamilyByIndex (принимает индекс семьи из общего списка) - возвращает семью по указанному индексу. В случае, если запросили элемент с несуществующим индексом - возвращайте null.

       // deleteFamily (принимает индекс) - удаляет семью с заданным индексом, если такой индекс существует; возвращает true если удаление произошло, false - если нет.

       // deleteFamily (принимает тип Family) - удаляет семью если такая существует в списке; возвращает true если удаление произошло, false - если нет.

       // saveFamily (принимает тип Family) - обновляет существующую семью в БД если такая уже существует, сохраняет в конец списка - если нет
