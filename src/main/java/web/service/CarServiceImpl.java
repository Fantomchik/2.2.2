package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

//    @Autowired
//    private CarDao carDao;

    //@Transactional
    @Override
    public void addCar(Car car) {
//        carDao.addCar(car);
    }

    //@Transactional()
    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Supra", 1500));
        cars.add(new Car("Subaru", "Impreza", 300));
        cars.add(new Car("Nissan", "Skyline", 500));
        cars.add(new Car("Nissan", "370z", 400));
        cars.add(new Car("Porsche", "911", 420));
        return cars;
    }

    public static List<Car> outWithParam(String strCount){
        List<Car> cars = new CarServiceImpl().listCars();
        if(strCount == null){
            return cars;
        }
        else {
            int count = Integer.parseInt(strCount);
            if(count<5){
                return cars.subList(0, count);
            } else {
                return cars;
            }

        }
    }
}