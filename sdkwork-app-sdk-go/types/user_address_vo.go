package types

// 用户地址响应
type UserAddressVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Phone string `json:"phone"`
	CountryCode string `json:"countryCode"`
	ProvinceCode string `json:"provinceCode"`
	CityCode string `json:"cityCode"`
	DistrictCode string `json:"districtCode"`
	AddressDetail string `json:"addressDetail"`
	PostalCode string `json:"postalCode"`
	IsDefault bool `json:"isDefault"`
	FullAddress string `json:"fullAddress"`
}
