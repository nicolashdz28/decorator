import java.util.List;

public abstract class CatalogoDecorator implements CatalogoPeliculas {
    protected final CatalogoPeliculas catalogo;

    protected CatalogoDecorator(CatalogoPeliculas catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public ServicioStreaming getServicio() {
        return catalogo.getServicio();
    }

    @Override
    public List<String> obtenerPeliculas() {
        return catalogo.obtenerPeliculas();
    }//TODO: Implementar el método getServicio() para devolver el servicio de streaming correspondiente al catálogo decorado.
    //TODO: Implementar el método obtenerPeliculas() para devolver la lista de películas del catálogo decorado.
}