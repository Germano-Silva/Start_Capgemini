package aula;

@interface Annotations_01 {

	String autor();
	int    aulaNumero();
    char   aulaLetra();
	String website() default "https://startcapgemini.com.br/";
}