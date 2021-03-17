package AUTOMATION;

public class MAVEN {

//	<plugins>
//    [...]
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-surefire-plugin</artifactId>
//        <version>2.12.3</version>
//        <configuration>
//          <parallel>methods</parallel>
//        </configuration>
//      </plugin>
//    [...]
//    </plugins>
//    
//	Атрибут parallel может принимать значения«classes»,«methods»или«both».
//	При этом нельзя однозначно утверждать о	количестве запущенных
//	одновременно тестов, это напрямую зависит от параметров
//	компьютера и настроек плагина по-умолчанию.
//
//	Во время запуска теста найдите следующую строку в консоли,
//	она позволяет узнать параметры с которыми выполняется параллельный запуск:
//
//	Concurrency config is parallel='methods', perCoreThreadCount=true, threadCount=2, useUnlimitedThreads=false
//
//	Атрибут threadCount	позволяет указать, сколько потоков должно быть выделено	для запуска
//	тестов (сколько тестов должно запускаться параллельно). 
//	Обратите внимание, что его использование с параметром perCoreThreadCount,
//	установленным в true, может исказить реальное количество запускаемых одновременно тестов.
//	В то же время perCoreThreadCount позволяет добиться большей гибкости при запуске тестов на разных машинах.
//	Например, при запуске тестов со следующей конфигурацией на машине с 2-х ядерным процессором, одновременно
//	будут выполняться 4 тестовых класса, а не 2:
//	
//		<plugins>
//	    [...]
//	      <plugin>
//	        <groupId>org.apache.maven.plugins</groupId>
//	        <artifactId>maven-surefire-plugin</artifactId>
//	        <version>2.12.3</version>
//	        <configuration>
//	          <parallel>classes</parallel>
//	          <perCoreThreadCount>true</perCoreThreadCount>
//	          <threadCount>2</threadCount>
//	        </configuration>
//	      </plugin>
//	    [...]
//	</plugins>
//
//	Существует еще такой атрибут как useUnlimitedThreads. При его использовании будет создаваться столько потоков, 
//	сколько классов или методов в Вашем проекте, и все тесты будут пытаться запуститься одновременно.
//	useUnlimitedThreads отлично работает для юнит-тестов, но для функционального web тестирования его лучше не использовать.
//
//	Настройки конфигурации полностью зависят от характера Ваших тестов, поэтому стоит поэкспериментировать
//	с различными конфигурациями и посмотреть, какой из вариантов настройки больше всего подходит для Вас.

}