import Foundation

public class AddressApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取地址详情
    public func getAddressDetail(addressId: String) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address/\(addressId)"))
        return response as? PlusApiResultUserAddressVO
    }

    /// 更新地址
    public func updateAddress(addressId: String, body: UserAddressUpdateForm) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.put(ApiPaths.appPath("/user/address/\(addressId)"), body: body)
        return response as? PlusApiResultUserAddressVO
    }

    /// 删除地址
    public func deleteAddress(addressId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/user/address/\(addressId)"))
        return response as? PlusApiResultVoid
    }

    /// 设置默认地址
    public func setDefault(addressId: String) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.put(ApiPaths.appPath("/user/address/\(addressId)/default"), body: nil)
        return response as? PlusApiResultUserAddressVO
    }

    /// 获取地址列表
    public func listAddresses() async throws -> PlusApiResultListUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address"))
        return response as? PlusApiResultListUserAddressVO
    }

    /// 创建地址
    public func createAddress(body: UserAddressCreateForm) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.post(ApiPaths.appPath("/user/address"), body: body)
        return response as? PlusApiResultUserAddressVO
    }

    /// 获取默认地址
    public func getDefault() async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address/default"))
        return response as? PlusApiResultUserAddressVO
    }
}
