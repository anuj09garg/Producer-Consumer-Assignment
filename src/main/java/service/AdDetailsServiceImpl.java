package service;

import dao.AdDetailsDao;
import model.AdDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
//@ComponentScan(basePackages = {"service","dao"})
public class AdDetailsServiceImpl implements AdDetailsService{

    @Autowired
    AdDetailsDao adDao;

    static private Map<Long, AdDetail> MAP;

    static {
        MAP = new HashMap<>();
    }
    @Override
    public boolean saveAdDetailsToDB() {

        if(MAP != null){
            MAP.forEach((key,val)->{
                if(val.getAdTitle().contains("clone")){
                    adDao.save(val);

                }
            });
            return true;
        }
        return false;
    }

    @Override
    public boolean saveAdDetailsToMap(AdDetail adDetail) {
        MAP.put(adDetail.getAdId(), adDetail);
        if(MAP.get(adDetail.getAdId())!=null){
            return true;
        }
        return false;
    }


}
