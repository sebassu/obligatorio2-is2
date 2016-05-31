package volandoAlto.dominio;

public class Idioma {

    String[] palabras;
    int idiomaActual;

    /**
     *
     */
    public Idioma() {
        this.idiomaActual = 0;
        this.palabras = new String[]{"Welcome.", "Continue",
            "Flight Information", "Captain", "Flight", "Departure",
            "Departure", "Estimated arrival time", "Destination",
            "Time information", "and weather on arrival",
            "Welcome aboard.", "Flight attendant", "Delayed", "Select genre",
            "classical", "Pop", "Rock", "Electronics", "Reggae", "Alternative",
            "Stopped", "Playing"};
    }

    /**
     *
     * @return
     */
    public String[] getPalabras() {
        return palabras;
    }

    /**
     *
     * @param palabras
     */
    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    /**
     *
     * @return
     */
    public int getIdiomaActual() {
        return idiomaActual;
    }

    /**
     *
     * @param idiomaActual
     */
    public void setIdiomaActual(int idiomaActual) {
        this.idiomaActual = idiomaActual;
        cargarPalabras();
    }

    /**
     *
     */
    public void cargarPalabras() {
        switch (this.idiomaActual) {
            case 0:
                this.palabras = new String[]{"Welcome.", "Continue",
                    "Flight Information", "Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination",
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant", "Delayed", "Select genre",
                    "classical", "Pop", "Rock", "Electronics", "Reggae", "Alternative",
                    "Stopped", "Playing"};
                break;
            case 1:
                this.palabras = new String[]{"欢迎", "繼續", "航班信息", "队长", "机票",
                    "出发", "出发", "预计抵达时间", "目的地", "时间信息", "以及天气的到来",
                    "欢迎乘坐。", "主持人", "航班延误", "选择风格", "古典", "流行的", "岩石",
                    "电子", "雷鬼", "另类", "被捕", "我打"};
                break;
            case 2:
                this.palabras = new String[]{"Bienvenido.", "Continuar",
                    "Información del vuelo", "Capitán", "Vuelo", "Origen",
                    "Hora de salida", "Hora estimada de arribo", "destino",
                    "informacion de hora", "y clima en destino", "Bienvenido a bordo.",
                    "Azafata", "El vuelo está demorado", "Seleccione un género",
                    "Clásica", "Pop", "Rock", "Electrónica", "Reggae", "Alternativa",
                    "Detenido", "Reproduciendo"};
                break;
            case 3:
                this.palabras = new String[]{"Добро пожаловать.", "Продолжить",
                    "Информация о рейсах", "Капитан", "Полет", "отъезд", "отъезд",
                    "время Ожидаемое прибытие", "назначения", "время информация",
                    "и погода по прибытии", "Добро пожаловать.", "Хозяйка",
                    "Рейс задерживается", "Выберите жанр", "классический", "Поп",
                    "рок", "электроника", "Регги", "альтернатива", "арестованный",
                    "Я играл"};
                break;
            case 4:
                this.palabras = new String[]{"ترحيب", "تواصل", "معلومات الطيران",
                    "القبطان", "الطيران", "المغادرة", "المغادرة", "والوقت",
                    " للوصول", "والمقصد", "المعلومات", " لدى وصوه", "مرحبا",
                    "تأخر الرحلة", "تحديد النوع", "كلاسيكي", "فرقعة", "صخرة ",
                    "إلكترونيات", "الريغي ", "البديل ", "أوقف ", "د لعبت"};
                break;
            case 5:
                this.palabras = new String[]{"Bem-vindo.", "Continue",
                    "Informação de Voo", "Capitão", "Flight", "Origem",
                    "tempo da partida", "tempo estimado de chegada", "destino",
                    "informações de tempo ", "e clima na destino",
                    "Bem-vindo a bordo.", "Aeromoça", "O vôo está atrasado",
                    "Selecione um gênero", "Clássico", "Estouro", "Rocha",
                    "Eletrônica", "Reggae", "Alternativa", "Detido", "Joguei"};
                break;
            case 6:
                this.palabras = new String[]{"Benvenuto.", "Continua",
                    "Informazioni Volo", "capitano", "volo", "origine",
                    "Orario di partenza", "Tempo stimato di arrivo", "destinazione",
                    "informazioni in tempo", "e il clima all'arrivo",
                    "Benvenuti a bordo.", "Assistente di volo",
                    "Il volo è in ritardo", "Selezionare un genere", "Classico",
                    "Pop", "Rock", "Elettronica", "Reggae", "Alternativa", "Arrestato",
                    "ho giocato"};
                break;
            case 7:
                this.palabras = new String[]{"歓迎.", "続ける", "フライト情報", "船長",
                    "フライト", "起源", "出発時刻", "到着予定時刻", "先", "時刻情報",
                    "到着時に、気候", "ご搭乗ありがとうございます。", "スチュワーデス",
                    "フライトが遅れている", "ジャンルを選択", "クラシカル", "ポップ", "ロック",
                    "エレクトロニクス", "レゲエ", "代替案", "逮捕される", "私は〜をした"};
                break;
            case 8:
                this.palabras = new String[]{"Willkommen.", "Weitermachen",
                    "Fluginformationen", "Kapitän", "Flug", "Herkunft",
                    "Abfahrtszeit", "Geschätzte Ankunftszeit", "Ziel",
                    "Zeitinformationen", "Klima und bei der Ankunft",
                    "Willkommen an Bord.", "Stewardess", "Der Flug ist verspätet",
                    "Wählen Sie ein Genre", "Klassik", "Pop", "Rock", "Elektronik",
                    "Reggae", "Alternative", "Arrested", "Ich spielte"};
                break;
            case 9:
                this.palabras = new String[]{"Accueil.", "Continuez",
                    "Informations sur le vol", "capitaine", "vol", "origine",
                    "Heure de départ", "Heure d'arrivée estimée", "destination",
                    "des informations de temps", "et le climat à l'arrivée",
                    "Bienvenue à bord.", "hôtesse de l'air", "Le vol est retardé",
                    "Je choisis un genre", "Classique", "Pop", "Rock", "Electronique",
                    "Reggae", "Alternative", "Arrêté", "Lecture"};
                break;
            default:
                this.palabras = new String[]{"Welcome.", "Continue",
                    "Flight Information", "Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination",
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant", "Delayed", "Select genre",
                    "classical", "Pop", "Rock", "Electronics", "Reggae", "Alternative",
                    "Stopped", "Playing"};
                break;
        }
    }
}
