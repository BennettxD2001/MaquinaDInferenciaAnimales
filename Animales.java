package animales;

import java.util.Scanner;

public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int foca = 0;
        int pinguino = 0;
        int oso = 0;
        int perro = 0;
        int conejo = 0;
        int tortuga = 0;
        int gallo = 0;
        int tiburon = 0;
        int ardilla = 0;
        int mapache = 0;
        int leopardo = 0;
        int gato = 0;
        int leon = 0;
        int hormiga = 0;
        int tigre = 0;
        int mamut = 0;
        int pantera = 0;
        int jirafa = 0;
        int mariposa = 0;
        int mosca = 0;
        int medusa = 0;
        int delfin = 0;
        int puma = 0;
        int vaquitaMarina = 0;

        
        Scanner leer = new Scanner(System.in);
        System.out.println("Pregunta 1: ");
        System.out.println("¿Tú animal es acuático?");
        String respuesta = leer.nextLine();

        if ("Si".equals(respuesta)) {
            foca = foca + 1;
            pinguino = pinguino + 1;
            tiburon = tiburon + 1;
            delfin = delfin + 1;
            vaquitaMarina = vaquitaMarina + 1;
            medusa = medusa + 1;
            tortuga = tortuga + 1;

            System.out.println("Pregunta 2: ");
            System.out.println("¿Tú animal es un cetáceo?");
            String respuesta2 = leer.nextLine();

            if ("Si".equals(respuesta2)) {
                vaquitaMarina = vaquitaMarina + 1;
                delfin = delfin + 1;

                System.out.println("Pregunta 3: ");
                System.out.println("¿Tú animal esta en peligro de extinción?");
                String respuesta3 = leer.nextLine();

                if ("Si".equals(respuesta3)) {
                    vaquitaMarina = vaquitaMarina + 1;
                    System.out.println("Tú animal es la Vaquita Marina");

                } else {
                    delfin = delfin + 1;
                    System.out.println("Tú animal es delfín");
                }
            } else {
                foca = foca + 1;
                pinguino = pinguino + 1;
                tiburon = tiburon + 1;
                medusa = medusa + 1;
                tortuga = tortuga + 1;

                System.out.println("Pregunta 3: ");
                System.out.println("¿Tú animal tiene pulmones?");
                String respuesta3 = leer.nextLine();

                if ("Si".equals(respuesta3)) {
                    foca = foca + 1;
                    pinguino = pinguino + 1;
                    tortuga = tortuga + 1;

                    System.out.println("Pregunta 4:");
                    System.out.println("¿Tú animal tiene plumas?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        pinguino = pinguino + 1;
                        System.out.println("Tú animal es un pingüino");
                    } else {
                        foca = foca + 1;
                        tortuga = tortuga + 1;

                        System.out.println("Pregunta 5:");
                        System.out.println("¿Tú animal tiene caparazón?");
                        String respuesta5 = leer.nextLine();

                        if ("Si".equals(respuesta5)) {
                            tortuga = tortuga + 1;
                            System.out.println("Tú animal es una tortuga");
                        } else {
                            foca = foca + 1;
                            System.out.println("Tú animal es una foca");
                        }
                    }
                } else {
                    tiburon = tiburon + 1;
                    medusa = medusa + 1;

                    System.out.println("Pregunta 4: ");
                    System.out.println("¿Tú animal carece de cerebro?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        tiburon = tiburon + 1;
                        System.out.println("Tú animal es un tiburón");
                    } else {
                        medusa = medusa + 1;
                        System.out.println("Tú animal es una medusa");
                    }
                }
            }
        } else {
            oso = oso + 1;
            perro = perro + 1;
            conejo = conejo + 1;
            gallo = gallo + 1;
            ardilla = ardilla + 1;
            mapache = mapache + 1;
            leopardo = leopardo + 1;
            gato = gato + 1;
            leon = leon + 1;
            tigre = tigre + 1;
            mamut = mamut + 1;
            pantera = pantera + 1;
            jirafa = jirafa + 1;
            puma = puma + 1;
            foca = foca + 1;
            tortuga = tortuga + 1;
            hormiga = hormiga + 1;
            mariposa = mariposa + 1;
            mosca = mosca + 1;

            System.out.println("Pregunta 2: ");
            System.out.println("¿Tú elección es un insecto?");
            String respuesta2 = leer.nextLine();

            if ("Si".equals(respuesta2)) {
                hormiga = hormiga + 1;
                mariposa = mariposa + 1;
                mosca = mosca + 1;

                System.out.println("Pregunta 3: ");
                System.out.println("¿Tú insecto vive debajo de la tierra?");
                String respuesta3 = leer.nextLine();

                if ("Si".equals(respuesta3)) {
                    hormiga = hormiga + 1;
                    System.out.println("Tú insecto es hormiga");

                    System.out.println("Pregunta 4: ");
                    System.out.println("¿Tú insecto se alimenta de nutrientes de desechos animales?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        mosca = mosca + 1;
                        System.out.println("Tú insecto es mosca");

                    } else {
                        mariposa = mariposa + 1;
                        System.out.println("Tú insecto es mariposa");
                    }
                } else {
                    System.out.println("Pregunta 4: ");
                    System.out.println("¿Tú insecto se alimenta de nutrientes de desechos animales?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        mosca = mosca + 1;
                        System.out.println("Tú insecto es mosca");

                    } else {
                        mariposa = mariposa + 1;
                        System.out.println("Tú insecto es mariposa");
                    }
                }
            } else {
                oso = oso + 1;
                perro = perro + 1;
                conejo = conejo + 1;
                gallo = gallo + 1;
                ardilla = ardilla + 1;
                mapache = mapache + 1;
                leopardo = leopardo + 1;
                gato = gato + 1;
                leon = leon + 1;
                tigre = tigre + 1;
                mamut = mamut + 1;
                foca = foca + 1;
                tortuga = tortuga + 1;
                pantera = pantera + 1;
                jirafa = jirafa + 1;
                puma = puma + 1;

                System.out.println("Pregunta 3: ");
                System.out.println("¿Tú animal es un felino?");
                String respuesta3 = leer.nextLine();

                if ("Si".equals(respuesta3)) {
                    leopardo = leopardo + 1;
                    gato = gato + 1;
                    leon = leon + 1;
                    tigre = tigre + 1;
                    pantera = pantera + 1;
                    puma = puma + 1;

                    System.out.println("Pregunta 4: ");
                    System.out.println("¿Tú animal se le conoce como rey de la selva?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        leon = leon + 1;
                        System.out.println("Tú animal es el León");

                    } else {
                        leopardo = leopardo + 1;
                        gato = gato + 1;
                        tigre = tigre + 1;
                        pantera = pantera + 1;
                        puma = puma + 1;

                        System.out.println("Pregunta 5: ");
                        System.out.println("¿Tú animal es el comúnmente mas domesticado?");
                        String respuesta5 = leer.nextLine();

                        if ("Si".equals(respuesta5)) {
                            gato = gato + 1;
                            System.out.println("Tú animal es el Gato");

                        } else {
                            leopardo = leopardo + 1;
                            tigre = tigre + 1;
                            pantera = pantera + 1;
                            puma = puma + 1;

                            System.out.println("Pregunta 7: ");
                            System.out.println("¿Tú animal tiene rayas?");
                            String respuesta7 = leer.nextLine();

                            if ("Si".equals(respuesta7)) {
                                tigre = tigre + 1;
                                System.out.println("Tú animal es el Tigre");

                            } else {
                                leopardo = leopardo + 1;
                                pantera = pantera + 1;
                                puma = puma + 1;

                                System.out.println("Pregunta 8: ");
                                System.out.println("¿Tú animal es representativo de una marca de tenis?");
                                String respuesta8 = leer.nextLine();

                                if ("Si".equals(respuesta8)) {
                                    puma = puma + 1;
                                    System.out.println("Tú animal es el Puma");

                                } else {
                                    leopardo = leopardo + 1;
                                    pantera = pantera + 1;

                                    System.out.println("Pregunta 9: ");
                                    System.out.println("¿Tú animal tiene el pelaje obscuro?");
                                    String respuesta9 = leer.nextLine();

                                    if ("Si".equals(respuesta9)) {
                                        pantera = pantera + 1;
                                        System.out.println("Tú animal es el Pantera");

                                    } else {
                                        leopardo = leopardo + 1;
                                        System.out.println("Tu animal es el Leopardo");
                                    }
                                }
                            }
                        }

                    }
                } else {
                    oso = oso + 1;
                    perro = perro + 1;
                    conejo = conejo + 1;
                    gallo = gallo + 1;
                    ardilla = ardilla + 1;
                    mapache = mapache + 1;
                    mamut = mamut + 1;
                    tortuga = tortuga + 1;
                    jirafa = jirafa + 1;
                    foca = foca + 1;

                    System.out.println("Pregunta 4: ");
                    System.out.println("¿Tú animal ya esta extinto?");
                    String respuesta4 = leer.nextLine();

                    if ("Si".equals(respuesta4)) {
                        mamut = mamut + 1;
                        System.out.println("Tú animal es el Mamut");

                    } else {
                        oso = oso + 1;
                        perro = perro + 1;
                        conejo = conejo + 1;
                        gallo = gallo + 1;
                        tortuga = tortuga + 1;
                        ardilla = ardilla + 1;
                        mapache = mapache + 1;
                        foca = foca + 1;
                        jirafa = jirafa + 1;

                        System.out.println("Pregunta 5: ");
                        System.out.println("¿Tú animal nació de un huevo?");
                        String respuesta5 = leer.nextLine();

                        if ("Si".equals(respuesta5)) {
                            gallo = gallo + 1;
                            tortuga = tortuga + 1;
                            System.out.println("Pregunta 6: ");
                            System.out.println("¿Tú animal tiene caparazón?");
                            String respuesta6 = leer.nextLine();

                            if ("Si".equals(respuesta6)) {
                                tortuga = tortuga + 1;
                                System.out.println("Tú animal es una tortuga");
                            } else {
                                gallo = gallo + 1;
                                System.out.println("Tú animal es un Gallo");
                            }

                        } else {
                            oso = oso + 1;
                            perro = perro + 1;
                            conejo = conejo + 1;
                            ardilla = ardilla + 1;
                            mapache = mapache + 1;
                            foca = foca + 1;
                            jirafa = jirafa + 1;

                            System.out.println("Pregunta 6: ");
                            System.out.println("¿Tú animal tiene un cuello largo?");
                            String respuesta6 = leer.nextLine();

                            if ("Si".equals(respuesta6)) {
                                jirafa = jirafa + 1;
                                System.out.println("Tú animal es una Jirafa");

                            } else {
                                oso = oso + 1;
                                perro = perro + 1;
                                conejo = conejo + 1;
                                ardilla = ardilla + 1;
                                foca = foca + 1;
                                mapache = mapache + 1;

                                System.out.println("Pregunta 7: ");
                                System.out.println("¿Tú animal es un roedor?");
                                String respuesta7 = leer.nextLine();

                                if ("Si".equals(respuesta7)) {
                                    ardilla = ardilla + 1;
                                    conejo = conejo + 1;

                                    System.out.println("Pregunta 8: ");
                                    System.out.println("¿Tú animal normalmente come nueces?");
                                    String respuesta8 = leer.nextLine();

                                    if ("Si".equals(respuesta8)) {
                                        ardilla = ardilla + 1;
                                        System.out.println("Tú animal es una ardilla");

                                    } else {
                                        conejo = conejo + 1;
                                        System.out.println("Tú animal es un conejo");
                                    }

                                } else {
                                    oso = oso + 1;
                                    perro = perro + 1;
                                    mapache = mapache + 1;
                                    foca = foca + 1;

                                    System.out.println("Pregunta 8: ");
                                    System.out.println("¿Tú animal es comúnmente domesticado?");
                                    String respuesta8 = leer.nextLine();

                                    if ("Si".equals(respuesta8)) {
                                        perro = perro + 1;
                                        System.out.println("Tú animal es un perro");

                                    } else {
                                        oso = oso + 1;
                                        mapache = mapache + 1;
                                        foca = foca + 1;

                                        System.out.println("Pregunta 9: ");
                                        System.out.println("¿Tú animal es de gran tamaño (mayor a 1.80) a su edad adulta?");
                                        String respuesta9 = leer.nextLine();

                                        if ("Si".equals(respuesta9)) {
                                            oso = oso + 1;
                                            System.out.println("Tú animal es un Oso");

                                        } else {
                                            mapache = mapache + 1;
                                            foca = foca + 1;
                                            
                                            System.out.println("Pregunta 10: ");
                                            System.out.println("¿Tú animal esta relacionado con una marca de jabón?");
                                            String respuesta10 = leer.nextLine();

                                            if ("si".equals(respuesta10)) {
                                                foca = foca + 1;
                                                System.out.println("Tú animal es una foca");

                                            } else {
                                                mapache = mapache + 1;
                                                System.out.println("Tú animal es un Mapache");
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
