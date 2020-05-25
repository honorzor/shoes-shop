package service;

import enums.SexType;

public interface ItemService {
    void findById(int id);
    void findBySex(SexType sexType);
    void findByPrice(int from , int to);

}
