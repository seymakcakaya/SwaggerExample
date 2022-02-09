package swagger.swaggerExample;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "Kitap Controller")

@RequestMapping("/api/books")
@RestController
public class BookController {
    List<Book> books=new ArrayList<Book>();
    {
        books.add(new Book(1,"Fareler ve İnsanlar","SEL YAYINCILIK ","John Steinbeck ","Roman"));
        books.add(new Book(2,"Yüzyıllık Yalnızlık","CAN YAYINLARI","Gabriel Garcia Marquez ","Roman"));
        books.add(new Book(3,"Siyah Lale","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Alexandre Dumas ","Roman"));
        books.add(new Book(4,"Suç ve Ceza","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Fyodor Mihailoviç Dostoyevski ","Roman"));
        books.add(new Book(5,"Sefiller","CAN YAYINLARI","Victor Hugo  ","Roman"));

    }

    @GetMapping("/getAll")
    public List<Book>getAll(){

        return books;
    }
    @PostMapping("/add")
    public String add(@RequestBody Book book) {
        books.add(book);
        return book.toString();
    }
    @GetMapping("/getByPublisherName")
    public List<Book> getByPublisherName(@RequestParam String publisherName){
        return books.stream().filter(x-> x.getPublisher().equals(publisherName)).collect(Collectors.toList());
    }


}
