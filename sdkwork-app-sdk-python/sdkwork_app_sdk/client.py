from .http_client import HttpClient, SdkConfig
from .api.workspaces import WorkspacesApi
from .api.voice_speakers import VoiceSpeakersApi
from .api.video import VideoApi
from .api.settings import SettingsApi
from .api.profile import ProfileApi
from .api.password import PasswordApi
from .api.address import AddressApi
from .api.tenant import TenantApi
from .api.social import SocialApi
from .api.shops import ShopsApi
from .api.share import ShareApi
from .api.ai import AiApi
from .api.projects import ProjectsApi
from .api.partner import PartnerApi
from .api.notification import NotificationApi
from .api.app import AppApi
from .api.news import NewsApi
from .api.music import MusicApi
from .api.invoice import InvoiceApi
from .api.image import ImageApi
from .api.style import StyleApi
from .api.file_system import FileSystemApi
from .api.feedback import FeedbackApi
from .api.favorite import FavoriteApi
from .api.drive import DriveApi
from .api.app_documents import AppDocumentsApi
from .api.dashboard import DashboardApi
from .api.collection import CollectionApi
from .api.chat import ChatApi
from .api.character import CharacterApi
from .api.category import CategoryApi
from .api.cart import CartApi
from .api.assets import AssetsApi
from .api.announcement import AnnouncementApi
from .api.advert import AdvertApi
from .api.vote import VoteApi
from .api.vip import VipApi
from .api.deactivate import DeactivateApi
from .api.bind import BindApi
from .api.avatar import AvatarApi
from .api.upload import UploadApi
from .api.search import SearchApi
from .api.payments import PaymentsApi
from .api.organization import OrganizationApi
from .api.disable import DisableApi
from .api.activate import ActivateApi
from .api.position import PositionApi
from .api.department import DepartmentApi
from .api.orders import OrdersApi
from .api.models import ModelsApi
from .api.history import HistoryApi
from .api.voice_speaker import VoiceSpeakerApi
from .api.sound_effect import SoundEffectApi
from .api.audio import AudioApi
from .api.feed import FeedApi
from .api.currency import CurrencyApi
from .api.coupons import CouponsApi
from .api.comments import CommentsApi
from .api.sms import SmsApi
from .api.register import RegisterApi
from .api.refresh import RefreshApi
from .api.qr import QrApi
from .api.phone import PhoneApi
from .api.oauth import OauthApi
from .api.logout import LogoutApi
from .api.login import LoginApi
from .api.audit import AuditApi
from .api.analytics import AnalyticsApi
from .api.activity import ActivityApi
from .api.account import AccountApi
from .api.ab import AbApi
from .api.sku import SkuApi
from .api.products import ProductsApi
from .api.positions import PositionsApi
from .api.members import MembersApi
from .api.departments import DepartmentsApi
from .api.children import ChildrenApi
from .api.statistics import StatisticsApi
from .api.member import MemberApi
from .api.list import ListApi
from .api.code import CodeApi


class SdkworkAppClient:
    """sdkwork-app-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.workspaces: WorkspacesApi
        self.voice_speakers: VoiceSpeakersApi
        self.video: VideoApi
        self.settings: SettingsApi
        self.profile: ProfileApi
        self.password: PasswordApi
        self.address: AddressApi
        self.tenant: TenantApi
        self.social: SocialApi
        self.shops: ShopsApi
        self.share: ShareApi
        self.ai: AiApi
        self.projects: ProjectsApi
        self.partner: PartnerApi
        self.notification: NotificationApi
        self.app: AppApi
        self.news: NewsApi
        self.music: MusicApi
        self.invoice: InvoiceApi
        self.image: ImageApi
        self.style: StyleApi
        self.file_system: FileSystemApi
        self.feedback: FeedbackApi
        self.favorite: FavoriteApi
        self.drive: DriveApi
        self.app_documents: AppDocumentsApi
        self.dashboard: DashboardApi
        self.collection: CollectionApi
        self.chat: ChatApi
        self.character: CharacterApi
        self.category: CategoryApi
        self.cart: CartApi
        self.assets: AssetsApi
        self.announcement: AnnouncementApi
        self.advert: AdvertApi
        self.vote: VoteApi
        self.vip: VipApi
        self.deactivate: DeactivateApi
        self.bind: BindApi
        self.avatar: AvatarApi
        self.upload: UploadApi
        self.search: SearchApi
        self.payments: PaymentsApi
        self.organization: OrganizationApi
        self.disable: DisableApi
        self.activate: ActivateApi
        self.position: PositionApi
        self.department: DepartmentApi
        self.orders: OrdersApi
        self.models: ModelsApi
        self.history: HistoryApi
        self.voice_speaker: VoiceSpeakerApi
        self.sound_effect: SoundEffectApi
        self.audio: AudioApi
        self.feed: FeedApi
        self.currency: CurrencyApi
        self.coupons: CouponsApi
        self.comments: CommentsApi
        self.sms: SmsApi
        self.register: RegisterApi
        self.refresh: RefreshApi
        self.qr: QrApi
        self.phone: PhoneApi
        self.oauth: OauthApi
        self.logout: LogoutApi
        self.login: LoginApi
        self.audit: AuditApi
        self.analytics: AnalyticsApi
        self.activity: ActivityApi
        self.account: AccountApi
        self.ab: AbApi
        self.sku: SkuApi
        self.products: ProductsApi
        self.positions: PositionsApi
        self.members: MembersApi
        self.departments: DepartmentsApi
        self.children: ChildrenApi
        self.statistics: StatisticsApi
        self.member: MemberApi
        self.list: ListApi
        self.code: CodeApi

        # Initialize API modules
        self.workspaces = WorkspacesApi(self._client)
        self.voice_speakers = VoiceSpeakersApi(self._client)
        self.video = VideoApi(self._client)
        self.settings = SettingsApi(self._client)
        self.profile = ProfileApi(self._client)
        self.password = PasswordApi(self._client)
        self.address = AddressApi(self._client)
        self.tenant = TenantApi(self._client)
        self.social = SocialApi(self._client)
        self.shops = ShopsApi(self._client)
        self.share = ShareApi(self._client)
        self.ai = AiApi(self._client)
        self.projects = ProjectsApi(self._client)
        self.partner = PartnerApi(self._client)
        self.notification = NotificationApi(self._client)
        self.app = AppApi(self._client)
        self.news = NewsApi(self._client)
        self.music = MusicApi(self._client)
        self.invoice = InvoiceApi(self._client)
        self.image = ImageApi(self._client)
        self.style = StyleApi(self._client)
        self.file_system = FileSystemApi(self._client)
        self.feedback = FeedbackApi(self._client)
        self.favorite = FavoriteApi(self._client)
        self.drive = DriveApi(self._client)
        self.app_documents = AppDocumentsApi(self._client)
        self.dashboard = DashboardApi(self._client)
        self.collection = CollectionApi(self._client)
        self.chat = ChatApi(self._client)
        self.character = CharacterApi(self._client)
        self.category = CategoryApi(self._client)
        self.cart = CartApi(self._client)
        self.assets = AssetsApi(self._client)
        self.announcement = AnnouncementApi(self._client)
        self.advert = AdvertApi(self._client)
        self.vote = VoteApi(self._client)
        self.vip = VipApi(self._client)
        self.deactivate = DeactivateApi(self._client)
        self.bind = BindApi(self._client)
        self.avatar = AvatarApi(self._client)
        self.upload = UploadApi(self._client)
        self.search = SearchApi(self._client)
        self.payments = PaymentsApi(self._client)
        self.organization = OrganizationApi(self._client)
        self.disable = DisableApi(self._client)
        self.activate = ActivateApi(self._client)
        self.position = PositionApi(self._client)
        self.department = DepartmentApi(self._client)
        self.orders = OrdersApi(self._client)
        self.models = ModelsApi(self._client)
        self.history = HistoryApi(self._client)
        self.voice_speaker = VoiceSpeakerApi(self._client)
        self.sound_effect = SoundEffectApi(self._client)
        self.audio = AudioApi(self._client)
        self.feed = FeedApi(self._client)
        self.currency = CurrencyApi(self._client)
        self.coupons = CouponsApi(self._client)
        self.comments = CommentsApi(self._client)
        self.sms = SmsApi(self._client)
        self.register = RegisterApi(self._client)
        self.refresh = RefreshApi(self._client)
        self.qr = QrApi(self._client)
        self.phone = PhoneApi(self._client)
        self.oauth = OauthApi(self._client)
        self.logout = LogoutApi(self._client)
        self.login = LoginApi(self._client)
        self.audit = AuditApi(self._client)
        self.analytics = AnalyticsApi(self._client)
        self.activity = ActivityApi(self._client)
        self.account = AccountApi(self._client)
        self.ab = AbApi(self._client)
        self.sku = SkuApi(self._client)
        self.products = ProductsApi(self._client)
        self.positions = PositionsApi(self._client)
        self.members = MembersApi(self._client)
        self.departments = DepartmentsApi(self._client)
        self.children = ChildrenApi(self._client)
        self.statistics = StatisticsApi(self._client)
        self.member = MemberApi(self._client)
        self.list = ListApi(self._client)
        self.code = CodeApi(self._client)

    def set_api_key(self, api_key: str) -> 'SdkworkAppClient':
        """Set API key for authentication."""
        self._client.set_api_key(api_key)
        return self

    def set_auth_token(self, token: str) -> 'SdkworkAppClient':
        """Set auth token for authentication."""
        self._client.set_auth_token(token)
        return self

    def set_access_token(self, token: str) -> 'SdkworkAppClient':
        """Set access token for authentication."""
        self._client.set_access_token(token)
        return self

    def set_header(self, key: str, value: str) -> 'SdkworkAppClient':
        """Set custom header."""
        self._client.set_header(key, value)
        return self

    @property
    def http(self) -> HttpClient:
        """Get the underlying HTTP client."""
        return self._client


def create_client(config: SdkConfig) -> SdkworkAppClient:
    """Create a new SDK client instance."""
    return SdkworkAppClient(config)
