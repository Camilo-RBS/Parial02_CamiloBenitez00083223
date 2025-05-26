package com.camilobenitez.parcial02.repository

import com.camilobenitez.parcial02.model.Product

object ProductRepository {
    val productList = listOf(
        Product(1, "Smartphone Galaxy", "Tecnología", 299.99, "Pantalla AMOLED, 128GB, cámara triple", "https://www.prado.com.sv/media/catalog/product/c/e/celular-5g-samsung-galaxy-a25-negro-8gb-ram-256gb-190783_7_.jpg?optimize=medium&bg-color=255,255,255&fit=bounds&height=700&width=700&canvas=700:700"),
        Product(2, "Zapatos Nike", "Ropa", 89.99, "Zapatos deportivos para correr", "https://www.libertysv.com/cdn/shop/products/350_741d4340-2c53-4fd6-8a58-f827082bb677_1024x1024.png?v=1620065821"),
        Product(3, "Cámara Canon", "Fotografía", 499.99, "Cámara réflex de alta resolución", "https://www.canon.com.mx/datacenter/image/resize-center/328x328/imagenesproducto/fichero/3512_EOS_6D_Mark_II_01.jpg/"),
        Product(4, "Laptop HP", "Tecnología", 799.99, "Intel i7, 16GB RAM, SSD 512GB", "https://www.officedepot.com.sv/medias/1200ftw-1301000505-4.jpg?context=bWFzdGVyfHJvb3R8Mjc3MjY3fGltYWdlL2pwZWd8YURkaUwyaG1ZeTh4TWpRMU56QXpOVFF6TVRrMk5pOHhNakF3Wm5SM1h6RXpNREV3TURBMU1EVXROQzVxY0djfDM1OGE1N2M3YjIzOGJkMDY2ODc5Mjg5NDAzNTdhN2YxYThlZTQwZGZhM2UwZDc0NzczYjBiYTcyZWNiYmIzZjQ"),
        Product(5, "Audífonos Sony", "Accesorios", 59.99, "Bluetooth, cancelación de ruido", "https://siman.vtexassets.com/arquivos/ids/5979993-800-800?v=638574602268100000&width=800&height=800&aspect=true"),
        Product(6, "Reloj Amazfit", "Tecnología", 129.99, "Smartwatch con monitor de ritmo cardíaco", "https://latic.com.co/wp-content/uploads/2023/03/Amazfit-Bip-u-Rosa-2.jpg"),
        Product(7, "Chaqueta Adidas", "Ropa", 74.99, "Impermeable, ideal para clima frío", "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/202307/07/00119763470267____6__1200x1200.jpg"),
        Product(8, "Teclado Logitech", "Accesorios", 109.99, "Teclado mecánico RGB con switches azules", "https://siman.vtexassets.com/arquivos/ids/5234821-800-450?v=638448387449900000&width=800&height=450&aspect=true"),
        Product(9, "Tablet Lenovo", "Tecnología", 199.99, "Pantalla de 10 pulgadas, Android 12", "https://tech.com.sv/wp-content/uploads/2021/04/Lenovo-TAB-M8-1.png"),
        Product(10, "Mochila Lenovo", "Accesorios", 39.99, "Para laptop, resistente y ligera", "https://tech.com.sv/wp-content/uploads/2020/08/71uMciapNnL._AC_SS450_.jpg")
    )
}
