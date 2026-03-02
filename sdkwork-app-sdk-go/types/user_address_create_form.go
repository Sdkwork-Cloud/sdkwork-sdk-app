package types

// 创建用户地址请求
type UserAddressCreateForm struct {
	Name string `json:"name"`
	Phone string `json:"phone"`
	CountryCode string `json:"countryCode"`
	ProvinceCode string `json:"provinceCode"`
	CityCode string `json:"cityCode"`
	DistrictCode string `json:"districtCode"`
	AddressDetail string `json:"addressDetail"`
	PostalCode string `json:"postalCode"`
	IsDefault bool `json:"isDefault"`
}
