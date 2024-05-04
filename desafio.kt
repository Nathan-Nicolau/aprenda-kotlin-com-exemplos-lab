enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
enum class TipoConteudo {VIDEOAULA, PROJETO, DESAFIO, EXTRA}
enum class Habilidades {JAVA, KOTLIN, ANDROID, HTML, CSS, JAVASCRIPT, VERSIONAMENTO, AGILE}

data class Usuario(val idUsuario: Int, var nomeUsuario: String, var habilidadesPrincipais: List<Habilidades>)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val tipoConteudo : TipoConteudo)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos: List<Usuario> = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val ceOrientacaoObjetos = ConteudoEducacional(nome = "POO com Java",duracao = 120,TipoConteudo.VIDEOAULA)
    val ceProjetoDesktop = ConteudoEducacional(nome = "Janela de Texto em Java", duracao = 180, TipoConteudo.PROJETO)
    val ceMentoriaMelhoresPraticas = ConteudoEducacional(nome = "Live com especialistas", duracao = 320, TipoConteudo.EXTRA)
    val listaConteudos = listOf<ConteudoEducacional>{ceOrientacaoObjetos,ceProjetoDesktop,ceMentoriaMelhoresPraticas}

    val formacaoJavaDeveloper = Formacao(nome = "Formação Java Developer", conteudos = listaConteudos)

}