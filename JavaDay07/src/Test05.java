class Worker{
    private String name; // 이름
    private String div; // 부서

    public Worker(String name, String div){
        this.name = name;
        this.div = div;
    }
    public void print(){
        System.out.println("사원이름: " + name);
        System.out.println("부    서: " + div);
    }
}
class Permanent extends Worker{	// 정규사원
    private int num;	// 사원번호
    private String po;	// 직책
    private int bon;	// 본봉
    private int su;		// 수당
    private int pay;	// 급여

    public Permanent(String name, String div, int num, String po, int bon, int su){
        super(name, div);
        this.num = num;
        this.po = po;
        this.bon = bon;
        this.su = su;
    }
    public void calcPay(){
        pay = bon + su;
    }
    public void printWorker(){
        System.out.println("-------- 정규사원 출력 --------");
        print();
        System.out.println("사원번호: " + num);
        System.out.println("직    책: " + po);
        System.out.println("급    여: " + pay + "원");
    }
}
class TimeWorker extends Worker{ // 임시사원
    private String snum;// 주민번호
    private int hour;	// 근무시간
    private int si;		// 시급
    private int pay;	// 급여

    public TimeWorker(String name, String div, String snum, int hour, int si){
        super(name, div);
        this.snum = snum;
        this.hour = hour;
        this.si = si;
    }
    public void calcPay(){
        pay = hour * si;
    }
    public void printWorker(){
        System.out.println("-------- 임시사원 출력 --------");
        print();
        System.out.println("주민번호: " + snum);
        System.out.println("급    여: " + pay + "원");
    }
}
class Test05{
    public static void main(String[] args){
        Permanent pw = new Permanent("홍길동", "영업부", 20140827, "대리", 2000000, 500000);
        pw.calcPay();
        pw.printWorker();

        TimeWorker tw = new TimeWorker("김철수", "마케팅", "123456-1000000", 80, 5000);
        tw.calcPay();
        tw.printWorker();
    }
}