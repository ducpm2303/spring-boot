package com.example.demo.specification;

public class UserSpecification {

    private UserSpecification() {
    }

//    public static Specification<User> filter(String username, String password) {
//
//        return (root, criteriaQuery, criteriaBuilder) -> {
//            // order
//            criteriaQuery.orderBy(criteriaBuilder.desc(root.get("id")));
//
//            // filter
//            Collection<Predicate> predicates = new ArrayList<>();
//
//            if ( StringUtils.isNotBlank(username) ) {
//                predicates.add(criteriaBuilder.equal(root.get("username"), username));
//            }
//
//            if ( StringUtils.isNotBlank(password) ) {
//                predicates.add(criteriaBuilder.equal(root.get("password"), password));
//            }
//
//            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
//        };
//    }
}
