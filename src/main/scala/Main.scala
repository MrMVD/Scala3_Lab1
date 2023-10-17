@main def hello: Unit =
 val text="In a magical forest, where the trees whispered a secret wind, there lived a little fairy named Alice. She had wings with exposed, shiny pollen that gave her the ability to fly. Every morning, Alice set out on his magical journey, and her power was able to flourish. One day, as Alice was flying over a field of flowers, she noticed that one of the trees began to wither. The fairy sank to the ground and decided to find out what was the cause of this trouble. She found that the tree roots were airy and decayed."
 val words = text.split("\\W+").map(_.capitalize).distinct.sorted //делим текст на слова, переводим их в словас большой буквы,убераем дубликаты и сортируем
 words.foreach(println) //вывод
