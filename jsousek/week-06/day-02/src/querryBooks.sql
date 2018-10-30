select book_name , aut_name, cate_descrip, pub_name, book_price
from book_mast
       join author on book_mast.aut_id = author.aut_id
       join category on book_mast.cate_id = category.cate_id
       join publisher on book_mast.pub_id = publisher.pub_id;