package swagger.swaggerExample;

import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "BookController", description = "Kitap Kontrol İşlemleri")
@RequestMapping("/api/books")
@RestController
public class BookController {


    @GetMapping("/getAll")
    @ApiOperation(value = "Tüm kitapları listeler",response = List.class)
    @ApiResponses(value={
            @ApiResponse(code=202,message = "Sistem çalışıyor")})
    public List<Book>getAll(){
        return books;
    }
    @PostMapping("/add")
    public String add(@RequestBody Book book) {
        books.add(book);
        return book.toString();
    }
    @GetMapping("/getByPublisherName")

    public List<Book> getByPublisherName(@ApiParam(value = "Aramak istediğiniz yayın evini yazınız",required = true) @RequestParam String publisherName){
        return books.stream().filter(x-> x.getPublisher().equals(publisherName)).collect(Collectors.toList());
    }
    List<Book> books=new ArrayList<Book>();
    {
        books.add(new Book(1,"Fareler ve İnsanlar","SEL YAYINCILIK ","John Steinbeck ","Roman"));
        books.add(new Book(2,"Yüzyıllık Yalnızlık","CAN YAYINLARI","Gabriel Garcia Marquez ","Roman"));
        books.add(new Book(3,"Siyah Lale","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Alexandre Dumas ","Roman"));
        books.add(new Book(4,"Suç ve Ceza","TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI ","Fyodor Mihailoviç Dostoyevski ","Roman"));
        books.add(new Book(5,"Sefiller","CAN YAYINLARI","Victor Hugo  ","Roman"));

    }

}
