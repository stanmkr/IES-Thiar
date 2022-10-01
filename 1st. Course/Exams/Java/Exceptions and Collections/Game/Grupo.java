import java.util.*;

/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Grupo {
    HashSet<Personaje> miembros;

    //  CONSTRUCTOR
    public Grupo() {
        miembros = new HashSet<>();
    }


    // MÉTODOS
    public boolean incluirPersonaje(Personaje p) {
        Mago m = new Mago(p.getNombre(), p.getFuerza());
        if (miembros.contains(m)) {
            return false;
        } else {
            return true;
        }
        // return miembros.add(m);
    }


    public Personaje getMiembro(String nombre) {
        for (Personaje e : miembros) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }


    public ArrayList<Mago> dameMagos() {
        ArrayList<Mago> m = new ArrayList<>();
        for (Personaje g : miembros) {
            if (g instanceof Mago) {
                m.add((Mago) g);
            }
        }
        return m;
    }


//    public boolean borrarPersonaje(String nombre) {
//        for (Personaje p : miembros) {
//            if (p.equals(p.getNombre())){
//                miembros.remove(p);
//                return true;
//            }else {
//                return false;
//            }
//        }
//    }

    public void mostrarMiembros() {
        for (Personaje p : miembros) {
            System.out.println(p.getNombre() + " fuerza: " + p.getFuerza());
        }
    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;

        Grupo grupo = (Grupo) o;

        return Objects.equals(miembros, grupo.miembros);
    }

    @Override
    public int hashCode() {
        return miembros != null ? miembros.hashCode() : 0;
    }
}
