package com.nd.serviceImp;

import com.nd.model.Bill;
import com.nd.repository.BillRepository;
import com.nd.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BillServiceImp implements BillService {
    @Autowired
    private BillRepository billRepository;
    @Override
    public List<Bill> displayData(String productId, int page, int size, String direction, String sortBy) {
        Pageable pageable = PageRequest.of(page,size,
                direction.equals("ASC")? Sort.Direction.ASC: Sort.Direction.DESC,sortBy);
        List<Bill> billList = billRepository.findByProductId(productId,pageable).getContent();
        return billList;
    }

    @Override
    public List<Integer> getListPage(String productId, int size) {
        int count = billRepository.countByProductId(productId);
        List<Integer> listPage = new ArrayList<>();
        for (int i = 0; i < (int) Math.ceil((double) count / (double) size); i++) {
            listPage.add(i+1);
        }
        return listPage;
    }

    @Override
    public Bill findById(int id) {
        return billRepository.findById(id).get();
    }


    @Override
    public List<Bill> findAll() {
        return billRepository.findAllBy();
    }
}
